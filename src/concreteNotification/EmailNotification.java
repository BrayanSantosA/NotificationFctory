package concreteNotification;

import notification.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
