
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
        
        gc.getManageCarFrame().getHomeButton().addActionListener(this);
        gc.getManageCarFrame().getWarehouseButton().addActionListener(this);
        gc.getManageCarFrame().getReceiptButton().addActionListener(this);
        gc.getManageCarFrame().getEquipmentButton().addActionListener(this);
        
        spc.getAccountFrame().getHomeButton().addActionListener(this);
        spc.getAccountFrame().getManagementButton().addActionListener(this);
        spc.getAccountFrame().getEquipmentButton().addActionListener(this);
        spc.getAccountFrame().getWarehouseButton().addActionListener(this);
        spc.getAccountFrame().getReceiptButton().addActionListener(this);

        mainframe = new JFrame();
        mainframe.setContentPane(lpc.getLoginFrame().getContentPane());
        mainframe.pack();
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
        lpc.getLoginFrame().getLoginButton().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if user press login button
        if(e.getSource().equals(lpc.getLoginFrame().getLoginButton())){
            if(lm.login(lpc.getLoginFrame().getUsername(), lpc.getLoginFrame().getPassword())){
                mainframe.dispose();
                mainframe = new JFrame();
                hc.getHomepageframe().getUsernameLabel().setText(lm.getAccount().getFirstName());
                hc.getHomepageframe().getManagementButton().addActionListener(this);
                hc.getHomepageframe().getStuffmanageButton().addActionListener(this);
                homepage = (JPanel) hc.getHomepageframe().getContentPane();
                mainframe.add(homepage);    
                mainframe.pack();
                mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainframe.setVisible(true);
            }
        //if user press management button
        }else if(e.getSource().equals(hc.getHomepageframe().getManagementButton()) ||
                e.getSource().equals(spc.getAccountFrame().getManagementButton())){
            mainframe.setContentPane(gc.getManageCarFrame().getContentPane());
        // if user press home button
        }else if(e.getSource().equals(gc.getManageCarFrame().getHomeButton()) ||
                e.getSource().equals(spc.getAccountFrame().getHomeButton())){
            mainframe.setContentPane(hc.getHomepageframe().getContentPane());
        // if user press stuff management button    
        }else if(e.getSource().equals(hc.getHomepageframe().getStuffmanageButton())){
            mainframe.setContentPane(spc.getAccountFrame().getContentPane());
        }
    }
}
