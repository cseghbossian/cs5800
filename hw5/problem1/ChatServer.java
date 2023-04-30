import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChatServer {
    private Map<String, User> users;
    private Map<User, List<User>> blockedUsers;

    public ChatServer() {
        this.users = new HashMap<>();
        this.blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        this.users.put(user.getName(), user);
        this.blockedUsers.put(user, new ArrayList<>());
    }

    public void unregisterUser(User user) {
        this.users.remove(user.getName());
        this.blockedUsers.remove(user);
    }

    public void sendMessage(Message message) {
        for (User recipient : message.getRecipients()) {
            if (!this.blockedUsers.get(recipient).contains(message.getSender())) {
                recipient.receiveMessage(message);
            }
        }
    }

    public void blockUser(User user, User blockedUser) {
        if (!this.blockedUsers.get(user).contains(blockedUser)) {
            this.blockedUsers.get(user).add(blockedUser);
        }
    }

    public void unblockUser(User user, User unblockedUser) {
        this.blockedUsers.get(user).remove(unblockedUser);
    }

}



