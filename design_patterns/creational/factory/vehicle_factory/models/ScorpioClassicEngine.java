package design_patterns.creational.factory.vehicle_factory.models;

import design_patterns.creational.factory.vehicle_factory.interfaces.IEngine;

public class ScorpioClassicEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Scorpio classic started");
    }
    @Override
    public void stop() {
        System.out.println("Scorpio classic stopped");
    }
}
