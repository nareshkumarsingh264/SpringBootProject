package com.naresh.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.naresh.model.ChatMessage;

@Controller
public class ChatController {
     
	@MessageMapping("/chat.addUser")
	@SendTo("topic/public")
	public ChatMessage addUser(@Payload ChatMessage chatMessage,SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username",chatMessage.getSender());
		return chatMessage;
	}

	
	   
		@MessageMapping("/chat.sendMessage")
		@SendTo("topic/public")
	public ChatMessage sendMSessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}
	
}

