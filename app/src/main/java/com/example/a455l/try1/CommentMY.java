package com.example.a455l.try1;

/**
 * Created by A455L on 19/12/2017.
 */

public class CommentMY {

    String commentID;
    String userName;
    String userComment;

    public CommentMY(){}

    public CommentMY(String commentID, String userName, String userComment) {
        this.commentID = commentID;
        this.userName = userName;
        this.userComment = userComment;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserComment() {
        return userComment;
    }
}
