package com.app.service;

import com.app.exception.BlogAlredyExist;
import com.app.exception.BlogNotFound;
import com.app.model.Blog;
import org.apache.catalina.User;

public interface IBlogService {
    public Blog saveBlog(Blog blog) throws BlogAlredyExist;
    public Blog findByBlogId(Integer bId) throws BlogNotFound;




}
