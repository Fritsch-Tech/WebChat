package at.htld.module.webchat.entity;

public class User {
    public String id;

    public String name;
    public String hash;

    public User(String name,String hash) {
        this.name = name;
        this.hash = hash;
    }
}
