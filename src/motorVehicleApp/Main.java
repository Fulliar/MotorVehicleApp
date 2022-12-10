package motorVehicleApp;

import motorVehicleApp.engineAndMotor.Engine;
import motorVehicleApp.engineAndMotor.FuelType;
import motorVehicleApp.motorlandvehicles.Car;
import motorVehicleApp.motorwatervehicles.Sail;
import motorVehicleApp.motorwatervehicles.Yatch;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(FuelType.Gasoline,150, 1200);
        Car car = new Car("BMW",2018,engine,"34TR4569",4,3);

        Engine engine1 = new Engine(FuelType.Diesel);
        Car car1 = new Car("Audi",2015,engine1,"34ZE2351",4,5);

        System.out.println(car);
        System.out.println(car1); //Default olan

        car.getEngine().setEnginePower(200);
        System.out.println(car);

        Engine sailEngine = new Engine(FuelType.PetrolOil);
        Sail sail = new Sail("Tekne Markası",2003,sailEngine,4,3.5,4.2,"AO2139213","Wood",4,"Triangular sails");
        System.out.println(sail);
        sail.setHullMaterial("CarbonFiber");
        System.out.println(sail);

        Engine yatchEngine = new Engine(FuelType.PetrolOil,200,1600);
        Yatch yatch = new Yatch("Yatch brand", 2008,yatchEngine,8,2.811,4.212,"YT231321","Wood",8,3,"MAN");
        System.out.println(yatch);

    }
}
/*
    12-Main class' ı oluşturun ve burada bir 'car' nesne oluşturun ve konsolda bu nesneyi yazdırın.
        Daha sonra enginePower' ı main class'ında güncelleyin ve ekrana yazdırın.
 */