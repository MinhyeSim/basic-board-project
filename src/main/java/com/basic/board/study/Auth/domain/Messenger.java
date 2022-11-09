package com.basic.board.study.Auth.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Messenger {
    private String messeage, code;
    private int status;
}
