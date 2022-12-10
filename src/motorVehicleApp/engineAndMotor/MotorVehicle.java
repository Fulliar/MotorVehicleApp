package motorVehicleApp.engineAndMotor;

public class MotorVehicle {
    private String brand;
    private int year;
    private Engine engine;

    public MotorVehicle(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
/*
5- MotorVehicle adında bir class oluşturun.
6- İçerisinde brand, year, engine property' leri olsun. Class çalıştığında bu 3 özellik de çalışsın.
 */
