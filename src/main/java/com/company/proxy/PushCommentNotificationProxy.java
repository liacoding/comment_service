package com.company.proxy;

import com.company.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy{

    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
