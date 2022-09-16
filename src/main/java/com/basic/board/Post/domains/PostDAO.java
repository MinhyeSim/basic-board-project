package com.basic.board.Post.domains;

import com.basic.board.Comment.domains.CommentDAO;
import com.basic.board.User.domains.UserDAO;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "posts")
public class PostDAO {

    @Id
    @Column(name = "posts_id")
    @GeneratedValue
    private long postId;

    @Column(length = 500)
    private @NotNull String title;

    @Column(columnDefinition = "TEXT")
    private @NotNull String content;

    @Column
    private @NotNull String writer;

    @Column(columnDefinition = "integer default 0")
    private @NotNull int view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDAO userDAO;

    @OneToMany(mappedBy = "posts", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OrderBy("commentId asc") // 댓글 정렬
    private List<CommentDAO> commentDAOList ;

}
