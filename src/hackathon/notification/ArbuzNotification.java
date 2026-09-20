package hackathon.notification;

public class ArbuzNotification implements Notification {
    @Override
    public String getMessage() {
        return "You joined the Arbuz track. Good luck!";
    }
}
