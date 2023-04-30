package com.app.service.impl;

import com.app.exception.BlogAlredyExist;
import com.app.exception.BlogNotFound;
import com.app.model.Blog;
import com.app.repo.BlogRepository;
import com.app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    BlogRepository blogRepository;
    @Override
    public Blog saveBlog(Blog blog) throws BlogAlredyExist {

        if(blogRepository.existsById(blog.getBlogId()))
        {
            throw  new BlogAlredyExist("Blog is Already Exist..!", HttpStatus.CONFLICT,409);
        }
        return blogRepository.save(blog);
    }

    @Override
    public Blog findByBlogId(Integer bId) throws BlogNotFound {
        return blogRepository.findById(bId).orElseThrow(()->new BlogNotFound("Blog Not Found",HttpStatus.NOT_FOUND,404));
    }
}
