package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;

public class SendSmsNotification implements ISendNotification {
    @Override
    public void send(){
        System.out.println("new sms sending...");
    }
}
