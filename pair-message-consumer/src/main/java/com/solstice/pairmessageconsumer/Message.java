package com.solstice.pairmessageconsumer;

public class Message {
    private Long id;
    private String msg;

    public Message() { }

    public Message(Long id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}