package com.laversi.workshop.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String body;
    private Date date;
    private AuthorDTO author;

    public CommentDTO(){

    }

    public CommentDTO(String body, Date date, AuthorDTO author) {
        this.body = body;
        this.date = date;
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return body;
    }

    public void setText(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
    

    
    
}
