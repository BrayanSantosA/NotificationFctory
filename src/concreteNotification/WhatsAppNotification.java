package concreteNotification;

import notification.Notification;

public class WhatsAppNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending WHATSAPP notification: " + message);
    }
}
