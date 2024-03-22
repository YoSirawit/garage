
import java.awt.event.*;

public class HomepageController implements ActionListener {
    private HomepageFrame hpf;
    
    public HomepageController(){
        
    }
    
    public void open(){
        hpf = new HomepageFrame();
    }
    public HomepageFrame getHomepageframe(){
        open();
        return this.hpf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
}
