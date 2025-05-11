package design_patterns.creational.factory.vehicle_factory.factories;

import design_patterns.creational.factory.vehicle_factory.enums.ScorpioType;
import design_patterns.creational.factory.vehicle_factory.interfaces.VehicleFactory;
import design_patterns.creational.factory.vehicle_factory.models.*;

public class CarFactory implements VehicleFactory {
    private Enum type;
    public CarFactory(Enum type){
        this.type = type;
    }

    @Override
    public Vehicle createVehicle() throws IllegalArgumentException{
        if(type == ScorpioType.N){
            return new ScorpioN();
        }else if(type == ScorpioType.CLASSIC){
            return new ScorpioClassic();
        }
        throw new IllegalArgumentException("type is invalid");
    }
}
