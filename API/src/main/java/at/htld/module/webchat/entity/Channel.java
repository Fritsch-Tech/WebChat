package at.htld.module.webchat.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "channels")
public class Channel {
    @Id
    private String id;

    private String name;
    private Boolean unreadMessages;
    private List<User> users;
    private List<Message> messages;

    public Channel(String name,List users) {
        this.users = users;
        this.name = name;
        this.messages = new ArrayList();
        unreadMessages = false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUnreadMessages() {
        return unreadMessages;
    }

    public List getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public List getMessages() {
        return messages;
    }


    public void addMessage(Message message) {
        this.messages.add(message);
        unreadMessages = true;
    }
}
