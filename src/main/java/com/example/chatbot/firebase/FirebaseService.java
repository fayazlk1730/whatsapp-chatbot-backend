
package com.example.chatbot.firebase;

import com.example.chatbot.models.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FirebaseService {

    private final List<Message> messageStore = new ArrayList<>();

    public void saveMessage(Message message) {
        messageStore.add(message);
    }

    public List<Message> getMessages() {
        return messageStore;
    }
}
