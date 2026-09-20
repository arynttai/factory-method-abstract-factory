package hackathon.notification;

public abstract class NotificationFactory {

    public abstract Notification createNotification();

    public void send() {
        Notification notification = createNotification();
        System.out.println(notification.getMessage());
    }
}
