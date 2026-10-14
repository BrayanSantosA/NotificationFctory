package notification;

public class NotificationService {
    SimpleNotificationFactory factory;

    public NotificationService(SimpleNotificationFactory factory) {
        this.factory = factory;
    }

    public Notification sendNotification(String type, String message) {
        Notification notification;

        notification = factory.createNotification(type);

        notification.send(message);
        return notification;
    }
}
