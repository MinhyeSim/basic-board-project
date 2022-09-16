package com.basic.board.Comment.domains;

import com.basic.board.Post.domains.PostDAO;
import com.basic.board.User.domains.UserDAO;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "comments")
public class CommentDAO {

    @Id
    @Column(name = "comments_id")
    @GeneratedValue
    private long commentId;

    @Column(columnDefinition = "TEXT")
    private @NotNull String comment;

    @Column(name = "created_date")
    @CreatedDate
    private @NotNull String createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private @NotNull String modifiedDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDAO userDAO; // username

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private PostDAO postDAO;
}
