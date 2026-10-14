package notification;

import concreteNotification.EmailNotification;
import concreteNotification.SMSNotification;
import concreteNotification.WhatsAppNotification;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Notification type must not be null or empty");
        }

        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "WHATSAPP":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
