import java.sql.*;
import javax.swing.JOptionPane;

public class Warehouse extends Online{
    private int id;
    private String name;
    private String type;
    private String Brand;
    private double price;
    private int volume;
    public TestConnection db;

    public Warehouse(){
        db = new TestConnection();
}
    public void showItems(){
        
    }
    public void addNewItems(String type, String Brand, String name, double price, int volume){
        try{
//            String add = "INSERT INTO inventory(item_type="+type+", brand="+Brand+", item_name="+name+", price="+price+", quantity="+volume+")";
            String add = String.format("INSERT INTO inventory (item_type, brand, item_name, price, quantity) VALUES ('%s', '%s', '%s', %f, %d)", type, Brand, name, price, volume);
            db.getUpdate(add);
            JOptionPane.showMessageDialog(null, "Updated Succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void removeItems(String name, int volume) {
        try{    
            String decrease = String.format("update inventory set quantity= quantity - %d WHERE item_name= '%s'", volume, name);
            db.getUpdate(decrease);
            JOptionPane.showMessageDialog(null, "Updated Succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void removeItems(int id, int volume){
        try{
            String decrease = String.format("UPDATE inventory SET quantity= quantity - %d WHERE ID= %d", volume, id);
            db.getUpdate(decrease);
            JOptionPane.showMessageDialog(null, "Updated Succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void deleteItem(int id, String name){
        try{
            String col = String.format("DELETE FROM inventory WHERE ID=%d OR item_name= '%s'", id, name);
            db.getUpdate(col);
            JOptionPane.showMessageDialog(null, "Updated Succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void addItems(int id, String name, int volume){
        try{
            String add = String.format("update inventory set quantity = quantity + %d where ID = %d OR item_name = '%s'", volume, id, name);
            db.getUpdate(add);
            JOptionPane.showMessageDialog(null, "Updated Succesfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
