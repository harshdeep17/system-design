package design_patterns.creational.factory.vehicle_factory.interfaces;

import design_patterns.creational.factory.vehicle_factory.models.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle() throws IllegalArgumentException;
}
