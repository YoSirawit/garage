
public class Car {
    public static final int STATUS_NOTWORKING = 0;
    public static final int STATUS_WORKING = 1;
    public static final int STATUS_FINISH = 2;
    
    private String carOwner;
    private String carName;
    private String brand;
    private String carID;
    private int status;
    private Bill bill;
    
    public Car(){
        this("", "", "", "", 0);
    }
    
    public Car(String carOwner, String brand, String carName, String carID, int status){
        this.carName = carName;
        this.carOwner = carOwner;
        this.brand = brand;
        this.carID = carID;
        this.status = status;
        this.bill = null;
    }
    
    public void setCarOwner(String owner){
        this.carOwner = owner;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setCarName(String name){
        this.carName = name;
    }
    public void setCarID(String ID){
        this.carID = ID;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public void setBill(Bill bill){
        this.bill = bill;
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
    public Bill getBill(){
        return this.bill;
    }
}
