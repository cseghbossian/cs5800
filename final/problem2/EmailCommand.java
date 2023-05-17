class EmailCommand implements Command {
    private EmailSender emailSender;

    public EmailCommand(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void execute() {
        emailSender.sendEmail();
    }
}