package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public class EmailTransportChannel implements ITransportChannel {
    @Override
    public void deliver(String to, String content) {
        System.out.println(String.format("Sending EMAIL to %s using smtp with %s", to, content));
    }
}
