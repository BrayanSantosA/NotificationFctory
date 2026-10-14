package main;

import notification.NotificationService;
import notification.SimpleNotificationFactory;
public class Main {

    public static void main(String[] args) {
        SimpleNotificationFactory factory = new SimpleNotificationFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification("email", "Your account has been created successfully.");
        service.sendNotification("sms", "Your verification code is 123456.");
        service.sendNotification("whatsapp", "Your order has been shipped.");
    }
}
