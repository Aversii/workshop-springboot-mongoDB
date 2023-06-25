package com.laversi.workshop.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private long timestamp;
    private Integer status;
    private String error;
    private String  msg;
    private String  path;
    
    public StandardError(){
        
    }
    
    public StandardError(long timestamp, Integer status, String error, String msg, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.msg = msg;
        this.path = path;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    
    
}
