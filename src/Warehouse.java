import java.sql.*;

public class Warehouse extends Online{
    private int ID;
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
        this.getStatement().
    }
    public void addItems(String type, String Brand, String name, Double price, int volume){
        try{
//            String add = "INSERT INTO inventory(item_type="+type+", brand="+Brand+", item_name="+name+", price="+price+", quantity="+volume+")";
            String add = String.format("INSERT INTO inventory (item_type, brand, item_name, price, quantity) VALUE ('%s', '%s', '%s', %f, %d)", type, Brand, name, price, volume);
            this.getStatement().executeUpdate(add);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void removeItems(String name, int volume) {
        try{
            String count = "SELECT quantity FROM inventory WHERE item_name="+name;
            int count1 = Integer.parseInt(count) - volume;
            String decrease = String.format("UPDATE inventory SET quantity= %d WHERE item_naem= '%s'", count1, name);
            this.getStatement().executeUpdate(decrease);
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
    public void deleteItem(int ID, String name){
        try{
            String col = String.format("DELETE FROM inventory WHERE ID=%d OR item_name= '%s'", ID, name);
            this.getStatement().executeQuery(col);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
