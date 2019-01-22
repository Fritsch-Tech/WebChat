package at.htld.module.webchat.entity;

import java.util.Date;


public class Message {
    private String cipherMessage;
    private Channel channel;
    private User user;
    private Date createdOn;

    Message(String cipherMessage,Channel channel,User user){
        this.cipherMessage = cipherMessage;
        this.channel = channel;
        this.user = user;
        this.createdOn = new Date();
    }

    public String getCipherMessage() {
        return cipherMessage;
    }


    public Channel getChannel() {
        return channel;
    }

}
