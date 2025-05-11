package design_patterns.creational.factory.vehicle_factory.models;

import design_patterns.creational.factory.vehicle_factory.interfaces.IBody;
import design_patterns.creational.factory.vehicle_factory.interfaces.IEngine;
import design_patterns.creational.factory.vehicle_factory.interfaces.IWheel;

public class ScorpioClassic extends Car{
    public ScorpioClassic() {
        super(new ScorpioClassicEngine(), new ScorpioClassicBody(), new ScorpioWheel());
    }
}
