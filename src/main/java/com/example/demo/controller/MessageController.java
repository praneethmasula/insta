package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageModel;
import com.example.demo.dto.MessagePreview;
import com.example.demo.repository.MessageRepo;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.Message;
import com.example.demo.entity.User;
@RestController
@CrossOrigin(value = "*")
public class MessageController {
	
	@Autowired
	private MessageRepo messageRepo;
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/getmessages/{from}/{to}")
	public List<MessageModel> getMessages(@PathVariable("from") String id, @PathVariable("to") String idd) {		

	List< Message> messages=new ArrayList();
			messages=messageRepo.getByID( id,idd);
	
	 Stream<MessageModel> mess=  messages.stream().map(x-> {
	        MessageModel foo = new MessageModel();
	        foo.setFrom(x.getFromm());
	        foo.setTime(x.getTimee());
	        foo.setTo(x.getToo());
	        foo.setMessage(x.getMessage());
	        return foo;
	      });
		return mess.collect(Collectors.toList());
	}
	
	@GetMapping("/getpreview/{id}")
	public List<MessagePreview> getMessagess(@PathVariable("id") String id ) {
		
		List< Message> messages=new ArrayList();
		messages=messageRepo.getByLoggedInUSer( id);
		System.out.println(messages);
		List<MessagePreview> list=new ArrayList();
		for(Message x:messages) {
			
			boolean res=false;
			
		for(MessagePreview messagePreview:list) {
			
			if(x.getFromm().equals(messagePreview.getFrom()) && x.getToo().equals(messagePreview.getTo()) || x.getFromm().equals(messagePreview.getTo()) && x.getToo().equals(messagePreview.getFrom())){
				res=true;
			}
		} 
		
		if(!res) {

			    MessagePreview foo = new MessagePreview();
			    if(x.getFromm().equals(id)) {
		        Optional<User> user=repository.findById( Integer.parseInt(x.getToo()));
		        if(user.isPresent()) {
		        	
		        	foo.setName(user.get().getUserName());
		  
		        }
		        
			    }
			    else {
			    	
				        Optional<User> user=repository.findById( Integer.parseInt(x.getFromm()));
				        if(user.isPresent()) {
				        	
				        	foo.setName(user.get().getUserName());
				  
				        }
			    }
		        foo.setFrom(x.getFromm());
		        foo.setLastText(x.getMessage());
		        foo.setTo(x.getToo());
		        foo.setFrom(x.getFromm());
		        list.add(foo);
		}
		        
		       
		}
		return list;
		
	}

}
