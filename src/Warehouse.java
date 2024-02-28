import java.sql.*;

public class Warehouse extends Online{
    private String name;
    private String type;
    private String Brand;
    private Double price;

    public Warehouse(){
    try{
        ResultSet result = this.getStatement().executeQuery("select * from inventory");
    }catch(Exception e){
        System.out.println(e);
    }
}
    public void showItems(){
        
    }
    public void addItems(String type, String Brand, String name, Double price, int volume){
        
    }
    public void removeItems(String name, int volume) {
        String del = "DELETE FROM inventory WHERE quantity=" + volume;
        this.getStatement().executeUpdate(del);
    }
    public void removeItems(int ID, int volume){
        
    }
}
