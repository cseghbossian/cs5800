import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private List<MessageMemento> messageHistory;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        this.messageHistory = new ArrayList<>();
        this.chatServer.registerUser(this);
    }

    public void sendMessage(User[] recipients, String content) {
        Message message = new Message(this, recipients, content);
        this.chatServer.sendMessage(message);
        this.chatHistory.addMessage(message);
        this.messageHistory.add(new MessageMemento(message.getContent(), message.getTimestamp()));
    }

    public void receiveMessage(Message message) {
        if (!this.chatHistory.containsMessage(message)) {
            this.chatHistory.addMessage(message);
        }
    }

    public void undoLastMessage() {
        if (!this.messageHistory.isEmpty()) {
            MessageMemento lastMessage = this.messageHistory.get(this.messageHistory.size() - 1);
            this.chatHistory.removeLastMessage();
            this.messageHistory.remove(this.messageHistory.size() - 1);
        }
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
}