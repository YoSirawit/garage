import java.sql.*;

public class Warehouse extends Online{
    private String ID;
    private String name;
    private String type;
    private String Brand;
    private Double price;
    private int volume;

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
        try{
            String add = "INSERT INTO inventory(item_type="+type+", brand="+Brand+", item_name="+name+", price="+price+", quantity="+volume+")";
            this.getStatement().executeUpdate(add);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void removeItems(String name, int volume) {
        try{
            String count = "SELECT quantity FROM inventory WHERE item_name="+name;
            int count1 = Integer.parseInt(count) - volume;
            String del = "DELETE FROM inventory (item_name, quantity) WHERE quantity="+ count1;
            this.getStatement().executeUpdate(del);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void removeItems(int ID, int volume){
        try{
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
