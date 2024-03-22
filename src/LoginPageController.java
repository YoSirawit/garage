import javax.swing.*;
import java.awt.event.*;

public class LoginPageController implements ActionListener {

    private LoginFrame lf;
    
    public LoginPageController(){
        this.lf = new LoginFrame();
        lf.setSize(1280, 720);
        lf.setResizable(false);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void close(){
        lf.close();
    }

    public LoginFrame getLoginFrame(){
        return this.lf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
