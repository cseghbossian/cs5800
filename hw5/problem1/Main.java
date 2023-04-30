import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Initialize the ChatServer and register the users
        ChatServer chatServer = new ChatServer();
        User user1 = new User("Celine", chatServer);
        User user2 = new User("Rahim", chatServer);
        User user3 = new User("Laila", chatServer);
        chatServer.registerUser(user1);
        chatServer.registerUser(user2);
        chatServer.registerUser(user3);

        // User 1 sends a message to User 2 and User 3
        user1.sendMessage(Arrays.asList(user2, user3).toArray(new User[0]), "Hello world! This is my first message");

        // User 1 checks their chat history 
        user1.viewChatHistory();

        // User 2 blocks messages from User 1
        user2.blockUser(user1);

        // User 1 sends another message to User 2 and User 3, but User 2 does not receive it
        user1.sendMessage(Arrays.asList(user2, user3).toArray(new User[0]), "Did this message go through to both of you or am I blocked?");

        // User 1 checks their chat history and sees messgage didnt go through
        user1.viewChatHistory();

        // User 3 sends a message to User 1
        user3.sendMessage(Arrays.asList(user1).toArray(new User[0]), "Hey I got your message but I dont think User 2 did?");

        // User 1 checks their chat history and sees the message from User 3
        user1.viewChatHistory();

        // User 2 unblocks messages from User 1
        user2.unblockUser(user1);

        // User 1 sends a message to User 2 and User 3
        user1.sendMessage(Arrays.asList(user2, user3).toArray(new User[0]), "Am I still blocked?");

        // User 1 checks their chat history and sees the deleted message
        user1.viewChatHistory();

        // User 1 tries to undo the last message and succeeds
        user1.undoLastMessage();

        // User 1 checks their chat history and sees the deleted message
        user1.viewChatHistory();

        // User 1 sends a message to User 2 and User 3
        user1.sendMessage(Arrays.asList(user2, user3).toArray(new User[0]), "Hello thanks for unblocking me");

        // User 1 checks their chat history and sees the deleted message
        user1.viewChatHistory();
    }
}
