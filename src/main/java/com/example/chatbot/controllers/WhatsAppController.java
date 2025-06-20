
package com.example.chatbot.controllers;

import com.example.chatbot.models.Message;
import com.example.chatbot.services.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WhatsAppController {

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody Message message) {
        return chatbotService.processMessage(message);
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return chatbotService.getAllMessages();
    }
}
