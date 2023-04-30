import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private ChatHistory chatHistory;
    private List<MessageMemento> messageHistory;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.messageHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }
}