
import java.awt.event.*;

public class EquipmentController implements ActionListener{

    private EquipmentMainFrame emf;
    
    public EquipmentController(Channel[] garage_ch){
        this.emf = new EquipmentMainFrame(garage_ch);
    }
    
    public EquipmentMainFrame getEquipmentFrame(){
        return this.emf;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
