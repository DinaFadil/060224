package lesson8.AbstractClassLesson8.MessagingSystem;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing a messaging system
public abstract class MessagingSystem {
    protected List<Message> messages;

    public MessagingSystem() {
        messages = new ArrayList<>();
    }

    // Method to send a message
    public abstract void sendMessage(Message message);

    // Method to receive a message
    public abstract Message receiveMessage();

    /*public boolean hasUnreadMessages() {
        for (Message message : messages) {
            if (!message.isRead()) {
                return true;
            }
        }
        return false;
    }*/
}
