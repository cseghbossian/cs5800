
public class Message {

    private User sender;
    private User[] recipients;
    private long timestamp;
    private String content;

    public Message(User sender, User[] recipients, String content) {
        this.sender = sender;
        this.recipients = recipients;
        this.content = content;

        this.timestamp = System.currentTimeMillis();
    }

    public User getSender() {
        return sender;
    }

    public User[] getRecipients() {
        return recipients;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }
}