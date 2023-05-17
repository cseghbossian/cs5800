class ReminderCommand implements Command {
    private ReminderApp reminderApp;

    public ReminderCommand(ReminderApp reminderApp) {
        this.reminderApp = reminderApp;
    }

    @Override
    public void execute() {
        reminderApp.setReminder();
    }
}