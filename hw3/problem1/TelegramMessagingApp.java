public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        System.out.print("Telegram message: ");
        messageType.sendMessage();
    }
}