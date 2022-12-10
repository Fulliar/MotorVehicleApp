package motorVehicleApp.motorwatervehicles;

import motorVehicleApp.engineAndMotor.Engine;
import motorVehicleApp.engineAndMotor.MotorVehicle;

public abstract class MotorWaterVehicles extends MotorVehicle {
    private int numberOfEngine;
    private double width;
    private double height;
    private String registry;
    private String hullMaterial;
    private int numberOfCabin;

    public MotorWaterVehicles(String brand, int year, Engine engine, int numberOfEngine, double width, double height, String registry, String hullMaterial, int numberOfCabin) {
        super(brand, year, engine);
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
        this.numberOfCabin = numberOfCabin;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public int getNumberOfCabin() {
        return numberOfCabin;
    }

    public void setNumberOfCabin(int numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }
}
