package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class SmsTransportChannel implements ITransportChannel {
    @Override
    public void deliver(String to, String content) {
        System.out.println(String.format("Sending SMS to %s using twilio with %s", to, content));
    }
}
