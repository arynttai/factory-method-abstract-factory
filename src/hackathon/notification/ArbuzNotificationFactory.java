package hackathon.notification;

public class ArbuzNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new ArbuzNotification();
    }
}
