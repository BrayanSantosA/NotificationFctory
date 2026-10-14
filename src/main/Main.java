package main;
import notification.Notification;
import notification.NotificationFactory;

public class Main {

    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Your account has been created successfully.");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Your verification code is 123456.");

        Notification whatsapp = NotificationFactory.createNotification("WHATSAPP");
        whatsapp.send("Your order has been shipped.");
    }
}
