package hackathon.notification;

public class TicketonNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new TicketonNotification();
    }
}
