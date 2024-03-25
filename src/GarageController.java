
import java.awt.event.*;

public class GarageController implements ActionListener {
    private Garage gr;
    private ManageCarFrame mcf;
    
    public GarageController(){
        this.gr = new Garage();
        open();
    }
    
    public void open(){
        this.mcf = new ManageCarFrame();
    }
    
    public ManageCarFrame getManageCarFrame(){
        return this.mcf;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
