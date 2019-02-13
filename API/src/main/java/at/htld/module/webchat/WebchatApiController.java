package at.htld.module.webchat;

import at.htld.module.webchat.entity.Channel;
import at.htld.module.webchat.entity.Message;
import at.htld.module.webchat.entity.User;
import at.htld.module.webchat.repositorys.ChannelRepository;
import at.htld.module.webchat.repositorys.MessageRepository;
import at.htld.module.webchat.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class WebchatApiController {

    @Autowired
    private UserRepository userRepository;
    private ChannelRepository channelRepository;
    private MessageRepository messageRepository;


    //"/channels/{id}" Get Channel
    @RequestMapping(value = "/channels/{id}", method = GET)
    public Optional<Channel> getChannel(@PathVariable("id") String channelId){

        return channelRepository.findById(channelId);
    }

    //"/channels" Get Channels
    @RequestMapping(value = "/channels", method = GET)
    public Optional getChannels(@RequestParam String selfId){

        return channelRepository.findByUserId(selfId);

    }


    //"/channels" Create Channel
    @RequestMapping(value = "/channels", method = POST)
    public Channel addChannel(  @RequestParam String selfId,
                                @NotNull @RequestBody String channelName,
                                @NotNull @RequestBody  String userId){

        List<String> users = new ArrayList<>();
        users.add(userId);
        users.add(selfId);
        Channel channel = new Channel(channelName,users);
        channelRepository.save(channel);
        return channel;
    }

    //"/channels/{id}/messages" Create Message
    @RequestMapping(value = "/channels/{id}/messages", method = POST)
    public Message addMessage(  @PathVariable("id") String channelId,
                                @NotNull @RequestBody  String messageContent,
                                @NotNull @RequestBody  String userId){

        Message message = new Message(messageContent,userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found")));

        channelRepository.findById(channelId).orElseThrow(() -> new IllegalArgumentException("Channel not found")).addMessage(message);

        return message;
    }

    //"/channels/{id}/messages" Get Messages
    @RequestMapping(value = "/channels/{id}/messages", method = GET)
    public Optional getMessages(@PathVariable("id") String channelId){

        Optional channel = channelRepository.findById(channelId);
        return channelRepository.findById(channelId);

    }

    //"/users/{id}" Get User
    @RequestMapping(value = "/users/{id}", method = GET)
    public Optional<User> getUser(@PathVariable("id") String userId){

        return userRepository.findById(userId);
    }

    //"/users" Create User
    @RequestMapping(value = "/users", method = POST)
    public User addUser(@NotNull @RequestBody    String username,
                        @NotNull @RequestBody    String email,
                        @NotNull @RequestBody    String password,
                                 @RequestBody    Image avatar){

        User user = new User(username,email,password,avatar);
        userRepository.save(user);
        return user;
    }

}
