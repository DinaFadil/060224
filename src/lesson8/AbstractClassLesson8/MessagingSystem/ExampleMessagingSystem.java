package lesson8.AbstractClassLesson8.MessagingSystem;

class ExampleMessagingSystem extends MessagingSystem implements NotificationService {
    @Override
    public void sendMessage(Message message) {
        messages.add(message);
        System.out.println("Message sent from " + message.getSender() + " to " + message.getRecipient() + ": " + message.getContent());
    }

    @Override
    public Message receiveMessage() {
        if (messages.isEmpty()) {
            System.out.println("No messages available.");
            return null;
        }
        Message message = messages.remove(0);
        message.setRead(true);
        System.out.println("Message received by " + message.getRecipient() + " from " + message.getSender() + ": " + message.getContent());
        return message;
    }

    @Override
    public void sendNotification() {
        //System.out.println("Notification sent to " + message.getRecipient() + ": " + message.getContent());
        System.out.println("Notification received!");
    }
}
