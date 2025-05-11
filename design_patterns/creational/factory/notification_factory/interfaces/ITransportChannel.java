package design_patterns.creational.factory.notification_factory.interfaces;

public interface ITransportChannel {
    void deliver(String to, String content);
}
