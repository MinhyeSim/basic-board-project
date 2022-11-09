package com.basic.board.study.User.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
// component 먼저 스캔 -> 그 중에서도 getter, setter 기능을 가진 Data를 먼저 찾음
public class UserDTO {
    @ApiModelProperty(position = 1) private long userId;
    @ApiModelProperty(position = 2) String username;
    @ApiModelProperty(position = 3) String nickname;
    @ApiModelProperty(position = 4) String password;
    @ApiModelProperty(position = 5) String email;

}
