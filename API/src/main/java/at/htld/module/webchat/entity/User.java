package at.htld.module.webchat.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    private String hash;
    private Image avatar;

    public User(String name,String email,String password,Image avatar) {
        this.name = name;
        this.email = email;
        this.hash = password;
        this.avatar = avatar;
    }

}
