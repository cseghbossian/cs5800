class PhoneCallCommand implements Command {
    private PhoneDialer phoneDialer;

    public PhoneCallCommand(PhoneDialer phoneDialer) {
        this.phoneDialer = phoneDialer;
    }

    @Override
    public void execute() {
        phoneDialer.dialPhone();
    }
}