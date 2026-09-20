package hackathon.notification;

public class TicketonNotification implements Notification {
    @Override
    public String getMessage() {
        return "You joined the Ticketon track. Good luck!";
    }
}
