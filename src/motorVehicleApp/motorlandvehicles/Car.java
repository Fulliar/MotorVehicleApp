package motorVehicleApp.motorlandvehicles;

import motorVehicleApp.engineAndMotor.Engine;


public class Car extends MotorLandVehicle {

    private int numberOfDoors;

    public Car(String brand, int year, Engine engine, String licensePlate, int numberOfWheels, int numberOfDoors) {
        super(brand, year, engine, licensePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors= " + numberOfDoors +
                ", licensePlate= " + getLicensePlate() +
                ", numberOfWheels= " + getNumberOfWheels() +
                ", brand= " + getBrand() +
                ", year= " + getYear() + " " +
                getEngine().toString();
    }
}
/*
    10- Car adında bir class oluşturun.
    11- Property olarak numberOfDoors olsun. Class çalıştığında bütün özellikleri tanımlamak zorunlu olsun.
 */

