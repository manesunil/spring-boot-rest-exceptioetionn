package com.app.controller;

import com.app.exception.BlogAlredyExist;
import com.app.exception.BlogNotFound;
import com.app.model.Blog;
import com.app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    IBlogService blogServiceImpl;
    @PostMapping("/")
    public ResponseEntity saveBlog(@RequestBody Blog blog){
    return ResponseEntity.ok( blogServiceImpl.saveBlog(blog));

    }

    @GetMapping("/{bId}")
    public ResponseEntity findBlog(@PathVariable("bId") Integer bid)
    {
            return ResponseEntity.ok(blogServiceImpl.findByBlogId(bid))  ;

    }

}
