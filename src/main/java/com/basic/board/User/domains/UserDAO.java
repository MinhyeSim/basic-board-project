package com.basic.board.User.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import javax.xml.soap.Text;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "users")
public class UserDAO {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;

    @Column(length = 30, unique = true)
    private @NotNull String username; //user 아이디

    @Column(unique = true)
    private @NotNull String nickname;

    @Column(length = 100)
    private @NotNull String password;

    @Column(length = 50, unique = true)
    private @NotNull String email;

}
