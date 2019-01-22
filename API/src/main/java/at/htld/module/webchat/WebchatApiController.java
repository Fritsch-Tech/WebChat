package at.htld.module.webchat;

import at.htld.module.webchat.entity.Channel;
import at.htld.module.webchat.entity.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class WebchatApiController {
    Map<String, List<Message>> channelMessages = new HashMap<>();

    //"/api/chat/list" all messages from chanel
    @RequestMapping(value = "/chat/{id}", method = GET)
    public List<Message> getChanelMessage(@PathVariable("id") String channelId){

        return channelMessages.get(channelId);
    }


    //"/api/chat/add"
    @RequestMapping(value = "/chat/{id}", method = POST)
    public Message addMessage(  @PathVariable("id") String channelId,
                                @RequestParam String channelName,
                                @RequestParam String cipherMessage){


        List<Message> messages = channelMessages.get(channelId);
        if(messages == null){
            messages = new ArrayList<>();
            channelMessages.put(channelId, messages);
        }

        Message message = new Message();
        messages.add(message);
        Channel channel = new Channel();
        channel.setName(channelName);
        channel.setId(channelId);
        message.setChannel(channel);
        message.setCipherMessage(cipherMessage);
        return message;
    }
}
