package at.htld.module.webchat;

import at.htld.module.webchat.repositorys.ChannelRepository;
import at.htld.module.webchat.repositorys.MessageRepository;
import at.htld.module.webchat.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebchatApplication {

    @Autowired
    private UserRepository userRepository;
    private ChannelRepository channelRepository;
    private MessageRepository messageRepository;


    public static void main(String[] args) {
        SpringApplication.run(WebchatApplication.class, args);
    }

}

