package design_patterns.creational.factory.notification_factory.factories;

import design_patterns.creational.factory.notification_factory.enums.NotificationType;
import design_patterns.creational.factory.notification_factory.models.*;


public class NotificationFactory {
    public static Notification createNotification(NotificationType type){
        switch (type) {
            case EMAIL:
                return new EmailNotification(new SendSmsNotification(),new EmailTransportChannel());
            case SMS:
                return new SmsNotification(new SendSmsNotification(), new SmsTransportChannel());
            case PUSH:
                return new PushNotification(new SendPushNotification(), new PushTransportChannel());
            default:
                throw new IllegalArgumentException("Invalid Notification Type");
        }
    }
}
