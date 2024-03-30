
import java.awt.event.*;

public class WarehousePageController implements ActionListener {
    private Warehouse wh;
    private StorageMain warehouse_frame;
    
    public WarehousePageController(){
        this.wh = new Warehouse();
        this.warehouse_frame = new StorageMain();
    }
    
    public StorageMain getWarehousePage(){
        return this.warehouse_frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
