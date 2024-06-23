package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.dto.MessageModel;
import com.example.demo.dto.UserStorage;
import com.example.demo.entity.Message;
import com.example.demo.repository.MessageRepo;

@Controller
public class PageWebsocketController {
	
	
	@Autowired
	private MessageRepo messageRepo;
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public MessageModel greeting(MessageModel message) throws Exception {
        Thread.sleep(1000); // simulated delay
        Message message2=new Message(message.getFrom(),message.getTo(),message.getTime(),message.getMessage());
       messageRepo.save(message2);
        return  message;
    }
    
    
   
   

}
