
import java.awt.event.*;

public class MainController implements ActionListener{
    private HomepageController hc;
    private LoginPageController lpc;
    private StuffPageController spc;
    private WarehousePageController wpc;
    private GarageController gc;
    private RequestItemController ric;
    
    public MainController(){
        hc = new HomepageController();
        lpc = new LoginPageController();
        spc = new StuffPageController();
        wpc = new WarehousePageController();
        gc = new GarageController();
        ric = new RequestItemController();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
