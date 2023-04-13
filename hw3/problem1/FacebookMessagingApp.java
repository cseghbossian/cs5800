public class FacebookMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        System.out.print("Facebook message: ");
        messageType.sendMessage();
    }
}
