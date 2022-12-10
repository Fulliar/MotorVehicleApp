package motorVehicleApp.motorwatervehicles;

import motorVehicleApp.engineAndMotor.Engine;

public class Sail extends MotorWaterVehicles {
    private String type;

    public Sail(String brand, int year, Engine engine, int numberOfEngine, double width, double height, String registry, String hullMaterial, int numberOfCabin, String type) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.type = type;
    }


    @Override
    public String toString() {
        return "Sail{" +
                "type='" + type + " /" +
                " MotorWaterVehicles{" +
                "numberOfEngine=" + getNumberOfEngine() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", registry=" + getHeight() +
                ", hullMaterial=" + getHullMaterial() +
                ", numberOfCabin=" + getNumberOfCabin() + " / " +
                getEngine().toString() +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
