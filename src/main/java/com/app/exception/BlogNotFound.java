package com.app.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Builder
@AllArgsConstructor
@Getter
public class BlogNotFound extends RuntimeException{

    private String msg;
    private HttpStatus status;
    private Integer code;

}
