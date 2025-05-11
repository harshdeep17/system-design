package design_patterns.creational.factory.vehicle_factory;

import design_patterns.creational.factory.vehicle_factory.enums.ScorpioType;
import design_patterns.creational.factory.vehicle_factory.factories.CarFactory;
import design_patterns.creational.factory.vehicle_factory.models.Car;
import design_patterns.creational.factory.vehicle_factory.models.Vehicle;

public class Main{
    public static void main(String[] args) {
        try{
            Vehicle scorpioN = new CarFactory(ScorpioType.N).createVehicle();
            scorpioN.start();
            System.out.println(scorpioN);
            scorpioN.stop();
//            Car scorpioInvalid = (Car) new CarFactory(ScorpioType.INVALID).createVehicle();
            Car scorpioClassic = (Car) new CarFactory(ScorpioType.CLASSIC).createVehicle();
            scorpioClassic.start();
            System.out.println(scorpioClassic);
            scorpioClassic.stop();
        } catch (Exception ex) {
            System.out.println(String.format("Car creation failed: %s", ex.getMessage()));
        }
    }
}
