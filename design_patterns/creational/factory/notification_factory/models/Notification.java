package design_patterns.creational.factory.notification_factory.models;

import design_patterns.creational.factory.notification_factory.interfaces.ISendNotification;
import design_patterns.creational.factory.notification_factory.interfaces.ITransportChannel;

public abstract class Notification {
    private ISendNotification sendNotification;
    private ITransportChannel transportChannel;

    public Notification(ISendNotification sendNotification, ITransportChannel transportChannel){
        this.sendNotification = sendNotification;
        this.transportChannel = transportChannel;
    }

    public void send(String to, String content){
        sendNotification.send();
        transportChannel.deliver(to, content);
    }
    @Override
    public String toString(){
        return String.format("SendNotification %s TransportChannel %s",
                sendNotification.getClass().getSimpleName(),
                transportChannel.getClass().getSimpleName());
    }
}
