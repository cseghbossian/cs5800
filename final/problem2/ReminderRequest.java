class ReminderRequest extends TemplateRequest {
    public ReminderRequest(int sourceId, int timestamp, Object metadata) {
        this.sourceId = sourceId;
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

    @Override
    public void sendCommand() {
        System.out.println("Executing reminder command...");
    }
}