
import java.awt.event.*;
import javax.swing.*;

public class HomepageController implements ActionListener {
    private HomepageFrame hpf;
    
    public HomepageController(Garage gr, JDesktopPane dtp){
        hpf = new HomepageFrame(gr, dtp);
        
        hpf.statusBn0.addActionListener(this);
        hpf.statusBn1.addActionListener(this);
        hpf.statusBn2.addActionListener(this);
        hpf.statusBn3.addActionListener(this);
        hpf.statusBn4.addActionListener(this);
        hpf.statusBn5.addActionListener(this);
        hpf.statusBn6.addActionListener(this);
        hpf.statusBn7.addActionListener(this);
        hpf.statusBn8.addActionListener(this);
        hpf.statusBn9.addActionListener(this);
    }
    
    public HomepageFrame getHomepageframe(){
        return this.hpf;
    }

    public void update(){
        hpf.update();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //connect status button and homepageSystem
        if (e.getSource() == hpf.statusBn0){
            hpf.getHps().ShowMoreCarDetail(0);
        }else if(e.getSource() == hpf.statusBn1){
            hpf.getHps().ShowMoreCarDetail(1);
        }else if(e.getSource() == hpf.statusBn2){
            hpf.getHps().ShowMoreCarDetail(2);
        }else if(e.getSource() == hpf.statusBn3){
            hpf.getHps().ShowMoreCarDetail(3);
        }else if(e.getSource() == hpf.statusBn4){
            hpf.getHps().ShowMoreCarDetail(4);
        }else if(e.getSource() == hpf.statusBn5){
            hpf.getHps().ShowMoreCarDetail(5);
        }else if(e.getSource() == hpf.statusBn6){
            hpf.getHps().ShowMoreCarDetail(6);
        }else if(e.getSource() == hpf.statusBn7){
            hpf.getHps().ShowMoreCarDetail(7);
        }else if(e.getSource() == hpf.statusBn8){
            hpf.getHps().ShowMoreCarDetail(8);
        }else if(e.getSource() == hpf.statusBn9){
            hpf.getHps().ShowMoreCarDetail(9);
        }
    }
    
    
}
