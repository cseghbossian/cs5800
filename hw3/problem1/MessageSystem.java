public class MessageSystem {
    private MessagingApp messagingApp;
    private MessageType messageType;

    public MessageSystem(MessagingApp messagingApp, MessageType messageType) {
        this.messagingApp = messagingApp;
        this.messageType = messageType;
    }

    public void sendMessage() {
        messagingApp.sendMessage(messageType);
    }
}
