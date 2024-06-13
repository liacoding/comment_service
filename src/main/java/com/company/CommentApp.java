package com.company;

import com.company.config.CommentConfig;
import com.company.model.Comment;
import com.company.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CommentConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Joe");
        comment.setText("Great job!");


        CommentService commentService = container.getBean(CommentService.class);

        commentService.publishComment(comment);

    }
}
