package motorVehicleApp.motorlandvehicles;
import motorVehicleApp.engineAndMotor.Engine;
import motorVehicleApp.engineAndMotor.MotorVehicle;

public abstract class MotorLandVehicle extends MotorVehicle {

    private String licensePlate;
    private int numberOfWheels;


    public MotorLandVehicle(String brand, int year, Engine engine, String licensePlate, int numberOfWheels) {
        super(brand, year, engine);
        this.licensePlate = licensePlate;
        this.numberOfWheels = numberOfWheels;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }


}
/*
7- Yukarıdaki işlemleri yaptığınız paketten ayrı iki paket daha oluşturun. Adları --> motorlandvehicles, motorwatervegicles olsun.
8- motorlandvehicles paketi içerisinde MotorLandVehicle abstract class' ı olsun.
Class'ın nesnesi oluştuğunda bütün özellikleri tanımlamak zorunlu olsun.
9- Class' ın licensePlate ve numberOfWheels property' leri olsun.
 */