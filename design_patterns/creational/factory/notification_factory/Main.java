package design_patterns.creational.factory.notification_factory;

import design_patterns.creational.factory.notification_factory.enums.NotificationType;
import design_patterns.creational.factory.notification_factory.factories.NotificationFactory;
import design_patterns.creational.factory.notification_factory.models.Notification;

public class Main {
    public static void main(String [] args){
        try{
            Notification email = NotificationFactory.createNotification(NotificationType.EMAIL);
            email.send("abc@gmail.com", "sending test email.");
            System.out.println(email);
//            Notification invalid = NotificationFactory.createNotification(NotificationType.INVALID);
            Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
            sms.send("1234567890", "sending test sms.");
            System.out.println(sms);
            Notification push = NotificationFactory.createNotification(NotificationType.PUSH);
            push.send("Test app", "sending test push.");
            System.out.println(push);

        }catch(Exception ex){
            System.out.println("Notification error "+ex.getMessage());
        }
    }
}
