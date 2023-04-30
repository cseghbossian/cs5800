import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private ChatServer chatServer;
    private ChatHistory chatHistory;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        this.chatServer.registerUser(this);
    }

    public void sendMessage(User[] recipients, String content) {
        Message message = new Message(this, recipients, content);
        this.chatServer.sendMessage(message);
        this.chatHistory.addMessage(message);
    }

    public void receiveMessage(Message message) {
        this.chatHistory.addMessage(message);

    }

    public void undoLastMessage() {
        this.chatHistory.removeLastMessage();
    }

    public void blockUser(User user) {
        this.chatServer.blockUser(this, user);
    }

    public void unblockUser(User user) {
        this.chatServer.unblockUser(this, user);
    }

    public String getName() {
        return name;
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }

    public void viewChatHistory() {
        System.out.println(chatHistory);
    }

}

