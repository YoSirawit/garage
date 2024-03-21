
import java.awt.event.*;

public class GarageController implements ActionListener {
    private Garage gr;
    private ManageCarFrame mcf;
    
    public GarageController(){
        this.gr = new Garage();
    }
    
    public void open(){
        this.mcf = new ManageCarFrame();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
