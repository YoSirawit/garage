import java.sql.*;

public class Warehouse extends Online{
    private int id;
    private String name;
    private String type;
    private String Brand;
    private double price;
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
    public void addItems(String type, String Brand, String name, double price, int volume){
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
    public void removeItems(int id, int volume){
        try{
            String count = "SELECT quantity FROM inventory WHERE ID="+id;
            int count1 = Integer.parseInt(count) - volume;
            String decrease = String.format("UPDATE inventory SET quantity= %d WHERE ID= %d", count1, id);
            this.getStatement().executeUpdate(decrease);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void deleteItem(int id, String name){
        try{
            String col = String.format("DELETE FROM inventory WHERE ID=%d OR item_name= '%s'", id, name);
            this.getStatement().executeQuery(col);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
