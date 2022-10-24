package com.basic.board.User.domains;

import com.basic.board.Post.domains.PostDAO;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.xml.soap.Text;
import java.util.List;


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
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{4,20}$", message = "아이디는 특수문자를 제외한 4~20자리여야 합니다.")
    private @NotNull String username; //user 아이디

    @Column(unique = true)
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private @NotNull String nickname;

    @Column(length = 100)
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{2,10}$", message = "닉네임은 특수문자를 제외한 2~10자리여야 합니다.")
    private @NotNull String password;

    @Column(length = 50, unique = true)
    @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "이메일 형식이 올바르지 않습니다.")
    private @NotNull String email;

    /*@OneToMany(mappedBy = "posts")
    private List<PostDAO> postDAOList;

    @OneToMany(mappedBy = "comments")
    private List<CommentDAO> commentDAOList;*/
}
