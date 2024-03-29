
import java.awt.event.*;
import javax.swing.*;

public class MainController implements ActionListener{
    private JFrame mainframe;
    private HomepageController hc;
    private LoginPageController lpc;
    private StuffPageController spc;
    private WarehousePageController wpc;
    private GarageController gc;
    private EquipmentController ec;
    private ReceiptController rc;
    private LoginManager lm;
    private JPanel homepage;
    
    public MainController(){
        lm = new LoginManager();
        hc = new HomepageController();
        lpc = new LoginPageController();
        spc = new StuffPageController();
        wpc = new WarehousePageController();
        gc = new GarageController();

        
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
                hc.getHomepageframe().getReceiptButton().addActionListener(this);
                hc.getHomepageframe().getEquipmentButton().addActionListener(this);
                
                rc = new ReceiptController(gc.getGarage().getAllCh());
                rc.getReceiptFrame().getHomeButton().addActionListener(this);
                rc.getReceiptFrame().getWarehouseButton().addActionListener(this);
                rc.getReceiptFrame().getStuffManageButton().addActionListener(this);
                rc.getReceiptFrame().getManagementButton().addActionListener(this);
                rc.getReceiptFrame().getEquipmentButton().addActionListener(this);
                
                ec = new EquipmentController(gc.getGarage().getAllCh());
                ec.getEquipmentFrame().getHomeButton().addActionListener(this);
                ec.getEquipmentFrame().getWarehouseButton().addActionListener(this);
                ec.getEquipmentFrame().getStuffManageButton().addActionListener(this);
                ec.getEquipmentFrame().getManagementButton().addActionListener(this);
                ec.getEquipmentFrame().getReceiptButton().addActionListener(this);
                
                homepage = (JPanel) hc.getHomepageframe().getContentPane();
                mainframe.add(homepage);    
                mainframe.setSize(1280, 720);
                mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainframe.setVisible(true);
            }
        //if user press management button
        }else if(e.getSource().equals(hc.getHomepageframe().getManagementButton()) ||
                e.getSource().equals(spc.getAccountFrame().getManagementButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getManagementButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getManagementButton())
                ){
            mainframe.setContentPane(gc.getManageCarFrame().getContentPane());
            gc.update();
        // if user press home button
        }else if(e.getSource().equals(gc.getManageCarFrame().getHomeButton()) ||
                e.getSource().equals(spc.getAccountFrame().getHomeButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getHomeButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getHomeButton())
                ){
            mainframe.setContentPane(hc.getHomepageframe().getContentPane());
        // if user press stuff management button    
        }else if(e.getSource().equals(hc.getHomepageframe().getStuffmanageButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getStuffManageButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getStuffManageButton())
                ){
            spc.update();
            mainframe.setContentPane(spc.getAccountFrame().getContentPane());
        // if user press receipt button
        }else if(e.getSource().equals(hc.getHomepageframe().getReceiptButton()) ||
                e.getSource().equals(spc.getAccountFrame().getReceiptButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getReceiptButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getReceiptButton())
                ){
            mainframe.setContentPane(rc.getReceiptFrame().getContentPane());
        // if user press equipment button
        }else if(e.getSource().equals(hc.getHomepageframe().getEquipmentButton()) ||
                e.getSource().equals(spc.getAccountFrame().getEquipmentButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getEquipmentButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getEquipmentButton())
                ){
            mainframe.setContentPane(ec.getEquipmentFrame().getContentPane());
            ec.getEquipmentFrame().update();
        }
    }
}
