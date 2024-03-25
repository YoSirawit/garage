
import java.awt.event.*;
import javax.swing.*;

public class MainController implements ActionListener{
    private JFrame mainframe;
    private HomepageController hc;
    private LoginPageController lpc;
    private StuffPageController spc;
    private WarehousePageController wpc;
    private GarageController gc;
    private RequestItemController ric;
    private LoginManager lm;
    private JPanel homepage;
    
    public MainController(){
        lm = new LoginManager();
        hc = new HomepageController();
        lpc = new LoginPageController();
        spc = new StuffPageController();
        wpc = new WarehousePageController();
        gc = new GarageController();
        ric = new RequestItemController();

        mainframe = new JFrame();
        mainframe.setContentPane(lpc.getLoginFrame().getContentPane());
        mainframe.pack();
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
        lpc.getLoginFrame().getLoginButton().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(lpc.getLoginFrame().getLoginButton())){
            if(lm.login(lpc.getLoginFrame().getUsername(), lpc.getLoginFrame().getPassword())){
                mainframe.dispose();
                mainframe = new JFrame();
                hc.getHomepageframe().getUsernameLabel().setText(lm.getAccount().getFirstName());
                hc.getHomepageframe().getCustomerQBN().addActionListener(this);
                homepage = (JPanel) hc.getHomepageframe().getContentPane();
                mainframe.add(homepage);    
                mainframe.pack();
                mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainframe.setVisible(true);
            }
        }else if(e.getSource().equals(hc.getHomepageframe().getCustomerQBN())){
                System.out.println("Change pages");
                mainframe.setContentPane(gc.getManageCarFrame().getContentPane());
//                mainframe.repaint();
                
            }
    }
}
