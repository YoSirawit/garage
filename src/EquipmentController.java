
import java.awt.event.*;

public class EquipmentController implements ActionListener{

    private EquipmentMainFrame emf;
    
    public EquipmentController(Garage gr){
        this.emf = new EquipmentMainFrame(gr);
    }
    
    public EquipmentMainFrame getEquipmentFrame(){
        return this.emf;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
