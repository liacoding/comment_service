package com.company.repository;

import com.company.model.Comment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class DBCommentRepository implements CommentRepository {

    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());
    }


}
