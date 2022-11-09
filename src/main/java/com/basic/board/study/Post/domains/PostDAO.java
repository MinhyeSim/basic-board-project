package com.basic.board.study.Post.domains;

import com.basic.board.study.User.domains.UserDAO;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


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
    private UserDAO userDAO ;


}
