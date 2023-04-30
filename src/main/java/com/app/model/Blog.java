package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Blog {
    @Id
    private int blogId;
    private String blogTitle;
    private String blogCreator;
    private int yearOfPost;

    public int getBlogId() {
        return blogId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogCreator='" + blogCreator + '\'' +
                ", yearOfPost=" + yearOfPost +
                '}';
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public String getBlogCreator() {
        return blogCreator;
    }

    public int getYearOfPost() {
        return yearOfPost;
    }
}
