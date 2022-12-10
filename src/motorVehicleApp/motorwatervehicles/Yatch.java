package motorVehicleApp.motorwatervehicles;

import motorVehicleApp.engineAndMotor.Engine;

public class Yatch extends MotorWaterVehicles {
    private int numberOfBeds;
    private String engineBrand;

    public Yatch(String brand, int year, Engine engine, int numberOfEngine, double width, double height, String registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "Yatch{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand='" + engineBrand + '\'' +
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
}
