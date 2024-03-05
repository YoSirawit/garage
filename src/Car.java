
public class Car {
    private String name;
    private String brand;
    private String carID;
    private int status;
    public Car(String name, String brand, String carID, int status) {
        this.name = name;
        this.brand = brand;
        this.carID = carID;
        this.status = status;
    }
    public String getName() {
        return this.name;
    }
    public String getBrand() {
        return this.brand;
    }
    public String getCarID() {
        return this.carID;
    }
    public int getStatus() {
        return this.status;
    }
}
