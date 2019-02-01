package at.htld.module.webchat.entity;

import java.awt.*;

public class User {
    public String id;

    public String name;
    public String email;
    public String hash;
    public Image avatar;

    public User(String name,String email,String password,Image avatar) {
        this.name = name;
        this.email = email;
        this.hash = password;
        this.avatar = avatar;
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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }
}
