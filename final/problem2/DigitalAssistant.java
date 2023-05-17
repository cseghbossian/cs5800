import java.util.ArrayList;
import java.util.List;

class DigitalAssistant {
    private EmailSender emailSender;
    private PhoneDialer phoneDialer;
    private MusicPlayer musicPlayer;
    private ReminderApp reminderApp;
    private List<Command> commands;

    public DigitalAssistant() {
        this.emailSender = new EmailSender();
        this.phoneDialer = new PhoneDialer();
        this.musicPlayer = new MusicPlayer();
        this.reminderApp = new ReminderApp();
        this.commands = new ArrayList<>();
    }

    public void sendEmail(int sourceId, int timestamp, Object metadata) {
        TemplateRequest request = new EmailRequest(sourceId, timestamp, metadata);
        request.validateInput();
        request.sendCommand();
        request.updateLogs();
        request.pushNotification();
        commands.add(new EmailCommand(emailSender));
    }

    public void phoneCall(int sourceId, int timestamp, Object metadata) {
        TemplateRequest request = new PhoneCallRequest(sourceId, timestamp, metadata);
        request.validateInput();
        request.sendCommand();
        request.updateLogs();
        request.pushNotification();
        commands.add(new PhoneCallCommand(phoneDialer));
    }

    public void playMusic(int sourceId, int timestamp, Object metadata) {
        TemplateRequest request = new MusicRequest(sourceId, timestamp, metadata);
        request.validateInput();
        request.sendCommand();
        request.updateLogs();
        request.pushNotification();
        commands.add(new MusicCommand(musicPlayer));
    }

    public void setReminder(int sourceId, int timestamp, Object metadata) {
        TemplateRequest request = new ReminderRequest(sourceId, timestamp, metadata);
        request.validateInput();
        request.sendCommand();
        request.updateLogs();
        request.pushNotification();
        commands.add(new ReminderCommand(reminderApp));
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}