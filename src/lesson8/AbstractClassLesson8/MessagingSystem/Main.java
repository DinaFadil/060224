package lesson8.AbstractClassLesson8.MessagingSystem;

public class Main {
    public static void main(String[] args) {
        ExampleMessagingSystem exampleSystem = new ExampleMessagingSystem();

        // Sending messages
        exampleSystem.sendMessage(new Message("sender@example.com", "recipient@example.com", "Hello, how are you?"));
        exampleSystem.sendMessage(new Message("recipient@example.com", "sender@example.com", "Hi, I'm good. Thanks!"));

        // Receiving messages
        exampleSystem.receiveMessage();
        exampleSystem.receiveMessage();

        if (exampleSystem.receiveMessage() == null) {
            exampleSystem.sendNotification();
        }

    }
    
}
