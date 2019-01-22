package at.htld.module.webchat.entity;

import java.util.List;

public class Channel {
    private String id;
    private List users;

    public Channel(List users) {
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

}
