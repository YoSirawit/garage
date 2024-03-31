
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.*;
import javax.swing.*;

public class MainController implements ActionListener{
    private JFrame mainframe;
    private JDesktopPane desktop_pane;
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

        lpc = new LoginPageController();

        wpc = new WarehousePageController();

        desktop_pane = new JDesktopPane();

        wpc.getWarehousePage().getHomeButton().addActionListener(this);
        wpc.getWarehousePage().getManagementButton().addActionListener(this);
        wpc.getWarehousePage().getEquipmentButton().addActionListener(this);
        wpc.getWarehousePage().getStuffManageButton().addActionListener(this);
        wpc.getWarehousePage().getReceiptButton().addActionListener(this);

        mainframe = new JFrame();
        mainframe.setContentPane(lpc.getLoginFrame().getContentPane());
        mainframe.pack();
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setVisible(true);
        mainframe.setLocationRelativeTo(null);
        lpc.getLoginFrame().getLoginButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if user press login button
        if(e.getSource().equals(lpc.getLoginFrame().getLoginButton())){
            if(lm.login(lpc.getLoginFrame().getUsername(), lpc.getLoginFrame().getPassword())){
                mainframe.dispose();
                mainframe = new JFrame();
                mainframe.setContentPane(desktop_pane);
                
                spc = new StuffPageController(lm, desktop_pane);
                spc.getAccountFrame().getHomeButton().addActionListener(this);
                spc.getAccountFrame().getManagementButton().addActionListener(this);
                spc.getAccountFrame().getEquipmentButton().addActionListener(this);
                spc.getAccountFrame().getWarehouseButton().addActionListener(this);
                spc.getAccountFrame().getReceiptButton().addActionListener(this);
                
                gc = new GarageController(desktop_pane);        
                gc.getManageCarFrame().getHomeButton().addActionListener(this);
                gc.getManageCarFrame().getWarehouseButton().addActionListener(this);
                gc.getManageCarFrame().getReceiptButton().addActionListener(this);
                gc.getManageCarFrame().getEquipmentButton().addActionListener(this);
                gc.getManageCarFrame().getStuffManageButton().addActionListener(this);
                
                hc = new HomepageController(gc.getGarage());
                hc.getHomepageframe().getUsernameLabel().setText(lm.getAccount().getFirstName());
                hc.getHomepageframe().getManagementButton().addActionListener(this);
                hc.getHomepageframe().getStuffManageButton().addActionListener(this);
                hc.getHomepageframe().getReceiptButton().addActionListener(this);
                hc.getHomepageframe().getEquipmentButton().addActionListener(this);
                hc.getHomepageframe().getWarehouseButton().addActionListener(this);
                
                rc = new ReceiptController(gc.getGarage().getAllCh());
                rc.getReceiptFrame().getHomeButton().addActionListener(this);
                rc.getReceiptFrame().getWarehouseButton().addActionListener(this);
                rc.getReceiptFrame().getStuffManageButton().addActionListener(this);
                rc.getReceiptFrame().getManagementButton().addActionListener(this);
                rc.getReceiptFrame().getEquipmentButton().addActionListener(this);
                
                ec = new EquipmentController(gc.getGarage());
                ec.getEquipmentFrame().getHomeButton().addActionListener(this);
                ec.getEquipmentFrame().getWarehouseButton().addActionListener(this);
                ec.getEquipmentFrame().getStuffManageButton().addActionListener(this);
                ec.getEquipmentFrame().getManagementButton().addActionListener(this);
                ec.getEquipmentFrame().getReceiptButton().addActionListener(this);
                
                homepage = (JPanel) hc.getHomepageframe().getContentPane();
                mainframe.add(homepage);
                mainframe.setSize(1280, 760);
                mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainframe.setVisible(true);
                mainframe.setLocationRelativeTo(null);
            }
        //if user press management button
        }else if(e.getSource().equals(hc.getHomepageframe().getManagementButton()) ||
                e.getSource().equals(spc.getAccountFrame().getManagementButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getManagementButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getManagementButton()) ||
                e.getSource().equals(wpc.getWarehousePage().getManagementButton())
                ){
            gc.getManageCarFrame().getUsernameLabel().setText(lm.getAccount().getFirstName());
            desktop_pane.removeAll();
            desktop_pane.revalidate();
            desktop_pane.repaint();
            gc.getGarage().update();
            gc.update();
            desktop_pane.add((JPanel)gc.getManageCarFrame().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(gc.getManageCarFrame().getContentPane());
            gc.update();
        // if user press home button
        }else if(e.getSource().equals(gc.getManageCarFrame().getHomeButton()) ||
                e.getSource().equals(spc.getAccountFrame().getHomeButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getHomeButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getHomeButton()) ||
                e.getSource().equals(wpc.getWarehousePage().getHomeButton())
                ){
            desktop_pane.removeAll();
            hc.update();
            desktop_pane.add(hc.getHomepageframe().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(hc.getHomepageframe().getContentPane());
        // if user press stuff management button    
        }else if(e.getSource().equals(hc.getHomepageframe().getStuffManageButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getStuffManageButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getStuffManageButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getStuffManageButton()) ||
                e.getSource().equals(wpc.getWarehousePage().getStuffManageButton())
                ){
            spc.getAccountFrame().getUsernameLabel().setText(lm.getAccount().getFirstName());
            spc.update();
            desktop_pane.removeAll();
            desktop_pane.add(spc.getAccountFrame().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(spc.getAccountFrame().getContentPane());
        // if user press receipt button
        }else if(e.getSource().equals(hc.getHomepageframe().getReceiptButton()) ||
                e.getSource().equals(spc.getAccountFrame().getReceiptButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getReceiptButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getReceiptButton()) ||
                e.getSource().equals(wpc.getWarehousePage().getReceiptButton())
                ){
            rc.getReceiptFrame().getUsernameLabel().setText(lm.getAccount().getFirstName());
            rc.getReceiptFrame().update();
            desktop_pane.removeAll();
            desktop_pane.add(rc.getReceiptFrame().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(rc.getReceiptFrame().getContentPane());
        // if user press equipment button
        }else if(e.getSource().equals(hc.getHomepageframe().getEquipmentButton()) ||
                e.getSource().equals(spc.getAccountFrame().getEquipmentButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getEquipmentButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getEquipmentButton()) ||
                e.getSource().equals(wpc.getWarehousePage().getEquipmentButton())
                ){
            ec.getEquipmentFrame().getUsernameLabel().setText(lm.getAccount().getFirstName());
            desktop_pane.removeAll();
            desktop_pane.add(ec.getEquipmentFrame().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(ec.getEquipmentFrame().getContentPane());
//            ec.getEquipmentFrame().update();
        // iff user press warehouse button
        }else if(e.getSource().equals(hc.getHomepageframe().getWarehouseButton()) ||
                e.getSource().equals(spc.getAccountFrame().getWarehouseButton()) ||
                e.getSource().equals(gc.getManageCarFrame().getWarehouseButton()) ||
                e.getSource().equals(rc.getReceiptFrame().getWarehouseButton()) ||
                e.getSource().equals(ec.getEquipmentFrame().getWarehouseButton())
                ){
            wpc.getWarehousePage().getUsernameLabel().setText(lm.getAccount().getFirstName());
            desktop_pane.removeAll();
            desktop_pane.add(wpc.getWarehousePage().getContentPane());
            mainframe.setContentPane(desktop_pane);
//            mainframe.setContentPane(wpc.getWarehousePage().getContentPane());
        }
    }
}
