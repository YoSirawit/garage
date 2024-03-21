
import java.awt.event.*;

public class LoginPageController implements ActionListener {
    private LoginManager lm;
    private LoginFrame lf;
    
    public LoginPageController(){
        this.lm = new LoginManager();
    }
    
    public void open(){
        lf = new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
