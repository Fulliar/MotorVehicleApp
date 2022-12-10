package motorVehicleApp.engineAndMotor;

public class Engine {
    public final int DEFAULT_ENGINEPOWER = 100 ;
    public final int DEFAULT_ENGINEVOLUME = 1500;
    private int enginePower;
    private int engineVolume;
    private FuelType fuelType;



    public Engine(FuelType fuelType, int enginePower, int engineVolume) {
        this.fuelType = fuelType;
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
    }
    //Engin çalıştığında fuelType DEFAULT_ENGINEPOWER ve DEFAULT_ENGINEVOLUME property' leri tanımlamak zorunlu olsun.
    public Engine(FuelType fuelType) {
        this.fuelType = fuelType;
        this.enginePower = DEFAULT_ENGINEPOWER;
        this.engineVolume = DEFAULT_ENGINEVOLUME;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", fuelType=" + fuelType +
                '}';
    }
}
/*
1- Engine adında bir class oluşturun.
2- İçerisinde enginePower, engineVolume, fuelType özellikleri olsun. fuelType bir enum olarak oluşturulup class' a property olarak tanımlansın.
Bütün property'ler private access modifier' a sahip olacak.
3- Class' ın değişmeyen ve default olarak değerleri kullanılan iki özelliği olsun. --> DEFAULT_ENGINEPOWER ve DEFAULT_ENGINEVOLUME
4- Engine çalıştığında enginePower, engineVolume, fuelType property' lerini tanımlamak zorunlu olsun veya Engin çalıştığında fuelType,
DEFAULT_ENGINEPOWER ve DEFAULT_ENGINEVOLUME property' leri tanımlamak zorunlu olsun.
 */