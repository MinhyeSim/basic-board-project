package com.basic.board.Auth.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public class SecurityRuntiomException {
    private static final long SerializableUID = 1L;
    private final String msg;
    private final HttpStatus httpStatus;
}
