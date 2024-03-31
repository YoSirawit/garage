
import java.awt.event.*;

public class HomepageController implements ActionListener {
    private HomepageFrame hpf;
    
    public HomepageController(Garage gr){
        hpf = new HomepageFrame(gr);
    }
    
    public HomepageFrame getHomepageframe(){
        return this.hpf;
    }

    public void update(){
        hpf.update();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
}
