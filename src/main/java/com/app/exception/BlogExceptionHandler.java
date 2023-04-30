package com.app.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class BlogExceptionHandler {
    @ExceptionHandler(value =BlogNotFound.class )
    public ResponseEntity handleBlogNoteFound(BlogNotFound blogNotFound)
    {

        return new ResponseEntity(blogNotFound.getMsg(),blogNotFound.getStatus());
    }
    @ExceptionHandler(value =BlogAlredyExist.class )
    public ResponseEntity handleBlogAlredyExist(BlogAlredyExist blogAlredyExist)
    {

        return new ResponseEntity(BlogAlredyExist.builder().msg(blogAlredyExist.getMsg()).build(),blogAlredyExist.getStatus());
    }
}
