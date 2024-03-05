
public class Car {
    private String carOwner;
    private String carName;
    private String brand;
    private String carID;
    private int status;
    public Car(String carOwner, String brand, String carName, String carID, int status) {
        this.carName = carName;
        this.carOwner = carOwner;
        this.brand = brand;
        this.carID = carID;
        this.status = status;
    }
    public String getCarOwner() {
        return this.carOwner;
    }
    public String getCarName() {
        return this.carName;
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
