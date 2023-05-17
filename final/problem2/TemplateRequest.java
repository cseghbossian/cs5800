import java.util.ArrayList;
import java.util.List;

abstract class TemplateRequest {
    protected int sourceId;
    protected int timestamp;
    protected Object metadata;

    public void validateInput() {
        System.out.println("Validating user input...");
    }

    public abstract void sendCommand(); 

    public void updateLogs() {
        System.out.println("Updating request logs...");
    }

    public void pushNotification() {
        System.out.println("Sending request status notification...");
    }
}