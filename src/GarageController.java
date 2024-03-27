
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class GarageController extends Online implements ActionListener {
    private Garage gr;
    private ManageCarFrame mcf;
    
    public GarageController(){
        this.gr = new Garage();
        this.mcf = new ManageCarFrame();
        
        for(int i=0; i<gr.getAllCh().length; i++){
            if(gr.getCh(i) != null && gr.getCh(i).getCar() != null){
                Channel cur_channel = gr.getCh(i);
                Car tmp_car = cur_channel.getCar();
                String id = tmp_car.getCarID();
                String brand = tmp_car.getBrand();
                String name = tmp_car.getCarName();
                int status = tmp_car.getStatus();
                String date_in = tmp_car.getDateIn();
                String date_out = tmp_car.getDateOut();

                mcf.getTable().setValueAt(i+1, i, 0);
                mcf.getTable().setValueAt(id, i, 1);
                mcf.getTable().setValueAt(brand, i, 2);
                mcf.getTable().setValueAt(name, i, 3);
                if(status == Car.STATUS_NOTWORKING){
                    mcf.getTable().setValueAt("Not Working", i, 4);
                }else if(status == Car.STATUS_WORKING){
                    mcf.getTable().setValueAt("Working", i, 4);
                }else if(status == Car.STATUS_FINISH){
                    mcf.getTable().setValueAt("Finish", i, 4);
                }
                mcf.getTable().setValueAt(date_in, i, 5);
                mcf.getTable().setValueAt(date_out, i, 6);
            }
            
        }
    }
    
    public ManageCarFrame getManageCarFrame(){
        return this.mcf;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
