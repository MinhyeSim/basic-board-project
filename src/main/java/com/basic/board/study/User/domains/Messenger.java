package com.basic.board.study.User.domains;

import lombok.Builder;
import lombok.Getter;

@Getter // 조회만 하기 (수정x)
@Builder
public class Messenger {
    private String message, code, token;
    private int status;
    // 서버 상태 (ex 404, 405 ..)
}
