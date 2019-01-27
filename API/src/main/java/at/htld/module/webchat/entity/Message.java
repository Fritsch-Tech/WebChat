package at.htld.module.webchat.entity;

import java.util.Date;

public class Message {
    private String id;

    private String cipherMessage;
    private User user;
    private Date createdOn;

    public Message(String cipherMessage,User user){
        this.cipherMessage = cipherMessage;
        this.user = user;
        this.createdOn = new Date();
    }

    public String getId() {
        return id;
    }

    public String getCipherMessage() {
        return cipherMessage;
    }

    public User getUser() {
        return user;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
}
