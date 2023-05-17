public class Main {
    public static void main(String[] args) {
        DigitalAssistant assistant = new DigitalAssistant();

        // Sending email requet
        assistant.sendEmail(1, 12345, "email metadata");
        
        // Making phone call requet
        assistant.phoneCall(2, 67890, "phone call metadata");
        
        // Playing music requet
        assistant.playMusic(3, 7777, "music metadata");
        
        // Setting reminder requet
        assistant.setReminder(4, 4444, "reminder metadata");
        
        // Execute the commands
        assistant.executeCommands();
    }
}