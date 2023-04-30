public class MessageMemento {
    private String content;
    private long timestamp;

    public MessageMemento(String content, long timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }


    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }


    @Override
    public String toString() {
        return "MessageMemento{" +
                "content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}