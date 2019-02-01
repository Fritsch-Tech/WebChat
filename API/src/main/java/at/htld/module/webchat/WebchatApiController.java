package at.htld.module.webchat;

import at.htld.module.webchat.entity.Channel;
import at.htld.module.webchat.entity.Message;
import at.htld.module.webchat.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class WebchatApiController {
    List<Channel> channels = new ArrayList<>();
    List<User> users = new ArrayList<>();


    //"/channels/{id}" Get Channel
    @RequestMapping(value = "/channels/{id}", method = GET)
    public Channel getChannel(@PathVariable("id") String channelId){

        return getChanelById(channelId);
    }

    //"/channels" Get Channels
    @RequestMapping(value = "/channels", method = GET)
    public List getChannels(@RequestParam String selfId){
        List<Channel> returnChannels = new ArrayList<>();

        for(Channel channel: channels){
            if(channel.getUsers().contains(selfId)){
                returnChannels.add(channel);
            }
        }
        return returnChannels;

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
        channels.add(channel);
        return channel;
    }

    //"/channels/{id}/messages" Create Message
    @RequestMapping(value = "/channels/{id}/messages", method = POST)
    public Message addMessage(  @PathVariable("id") String channelId,
                                @NotNull @RequestBody  String messageContent,
                                @NotNull @RequestBody  String userId){

        Message message = new Message(messageContent,getUserById(userId));
        getChanelById(channelId).addMessage(message);

        return message;
    }

    //"/channels/{id}/messages" Get Channels
    @RequestMapping(value = "/channels/{id}/messages", method = GET)
    public List getMessages(@PathVariable("id") String channelId){


        return getChanelById(channelId).getMessages();

    }

    //"/user/{id}" Get User
    @RequestMapping(value = "/user/{id}", method = GET)
    public User getUser(@PathVariable("id") String userId){

        return getUserById(userId);
    }

    //"/user" Create User
    @RequestMapping(value = "/user", method = POST)
    public User addUser(@NotNull @RequestBody    String userName,
                        @NotNull @RequestBody    String email,
                        @NotNull @RequestBody    String password,
                        @NotNull @RequestBody    Image avatar){

        User user = new User(userName,email,password,avatar);
        users.add(user);
        return user;
    }

    private Channel getChanelById(String id){
        for(Channel channel: channels){
            if(channel.getId().equals(id)){
                return channel;
            }
        }
        return null;
    }

    private User getUserById(String id){
        for(User user: users){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
