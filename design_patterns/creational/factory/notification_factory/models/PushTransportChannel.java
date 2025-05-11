package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class PushTransportChannel implements ITransportChannel {
    @Override
    public void deliver(String to, String content) {
        System.out.println(String.format("Sending PUSH notification to %s using firebase push with %s", to, content));
    }
}
