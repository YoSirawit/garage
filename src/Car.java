
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
    private String date_in;
    private String date_out;
    
    public Car(){
        this("", "", "", "", 0, "0000-00-0", "0000-00-00");
    }
    
    public Car(String carOwner, String brand, String carName, String carID, int status, String date_in, String date_out){
        this.carName = carName;
        this.carOwner = carOwner;
        this.brand = brand;
        this.carID = carID;
        this.status = status;
        this.bill = null;
        this.date_in = date_in;
        this.date_out = date_out;
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
    public String getDateIn(){
        return this.date_in;
    }
    public String getDateOut(){
        return this.date_out;
    }
    
}
