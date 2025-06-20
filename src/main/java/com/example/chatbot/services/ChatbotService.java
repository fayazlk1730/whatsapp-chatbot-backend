
package com.example.chatbot.services;

import com.example.chatbot.models.Message;
import com.example.chatbot.firebase.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatbotService {

    @Autowired
    private FirebaseService firebaseService;

    public String processMessage(Message message) {
        firebaseService.saveMessage(message);
        return "Received: " + message.getContent();
    }

    public List<Message> getAllMessages() {
        return firebaseService.getMessages();
    }
}
