import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatHistory {
    private final List<MessageMemento> mementos;

    public ChatHistory() {
        this.mementos = new ArrayList<>();
    }

    public void addMessage(Message message) {
        mementos.add(new MessageMemento(message.getContent(), message.getTimestamp()));
    }

    public void removeLastMessage() {
        if (mementos.size() > 0) {
            mementos.remove(mementos.size() - 1);
        }
        
    }

    public MessageMemento getLastMessage() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.get(mementos.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MessageMemento memento : mementos) {
            sb.append(memento.toString()).append("\n");
        }
        return sb.toString();
    }
}