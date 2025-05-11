package design_patterns.creational.factory.vehicle_factory.models;

import design_patterns.creational.factory.vehicle_factory.interfaces.IEngine;

public class ScorpioNEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Scorpio N started");
    }
    @Override
    public void stop() {
        System.out.println("Scorpio N stopped");
    }
}
