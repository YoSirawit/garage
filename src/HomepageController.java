
import java.awt.event.*;

public class HomepageController implements ActionListener {
    private HomepageFrame hpf;
    
    public HomepageController(){
        open();
    }
    
    public void open(){
        hpf = new HomepageFrame();
    }
    public HomepageFrame getHomepageframe(){
        return this.hpf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
}
