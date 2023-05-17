class EmailRequest extends TemplateRequest {
    public EmailRequest(int sourceId, int timestamp, Object metadata) {
        this.sourceId = sourceId;
        this.timestamp = timestamp;
        this.metadata = metadata;
    }

    @Override
    public void sendCommand() {
        System.out.println("Executing email command...");
    }
}
