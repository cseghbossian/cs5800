public class Main {
    
    public static void main(String[] args) {
        // Create various messaging apps
        MessagingApp whatsApp = new WhatsAppMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();

        // Create vatious message types
        MessageType textMessage = new TextMessage();
        MessageType imageMessage = new ImageMessage();
        MessageType videoMessage = new VideoMessage();

        // Create multiple message systems to demonstrate bridge design pattern
        MessageSystem messageSystem1 = new MessageSystem(whatsApp, textMessage);
        MessageSystem messageSystem2 = new MessageSystem(telegram, imageMessage);
        MessageSystem messageSystem3 = new MessageSystem(facebook, videoMessage);

        messageSystem1.sendMessage(); 
        messageSystem2.sendMessage(); 
        messageSystem3.sendMessage();
    }
}

