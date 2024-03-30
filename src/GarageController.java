
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class GarageController extends Online implements ActionListener {
    private Garage gr;
    private ManageCarFrame mcf;
    private TableActionEvent tav;
    
    public GarageController(){
        super();
        this.gr = new Garage();
        this.tav = new TableActionEvent() {
            @Override
            public void view(int row) {
                  System.out.println("view : "+row);
            }

            @Override
            public void edit(int row) {
                System.out.println("edit : "+row);
            }

            @Override
            public void del(int row) {
                String car_id = (String) mcf.getTable().getValueAt(row, 1);
                try{
                    String del = String.format("delete from car_list where car_id = '%s'", car_id);
                    getStatement().executeUpdate(del);
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
                gr.update();
                update();
                mcf.repaint();
                
                System.out.println("del : "+row);
            }
        };
        this.mcf = new ManageCarFrame(tav);
    }
    
    public ManageCarFrame getManageCarFrame(){
        return this.mcf;
    }
    
    public Garage getGarage(){
        return this.gr;
    }
    
    public void update(){
        if(mcf.getTable().getRowCount() != 0){
            for(int i=mcf.getTable().getRowCount()-1; i>=0; i--){
                ((DefaultTableModel)mcf.getTable().getModel()).removeRow(i);
            }
        }
        for(int i=0; i<gr.getAllCh().length; i++){
           Channel cur_channel = gr.getCh(i);
           ((DefaultTableModel)mcf.getTable().getModel()).addRow(new Object[0]);
           mcf.getTable().setValueAt(i+1, i, 0);
           if(gr.getCh(i).getCar() != null){
               Car tmp_car = cur_channel.getCar();
               String id = tmp_car.getCarID();
               String brand = tmp_car.getBrand();
               String name = tmp_car.getCarName();
               int status = tmp_car.getStatus();
               String date_in = tmp_car.getDateIn();
               String date_out = tmp_car.getDateOut();

               mcf.getTable().setValueAt(id, i, 1);
               mcf.getTable().setValueAt(brand, i, 2);
               mcf.getTable().setValueAt(name, i, 3);
               if(status == Car.STATUS_NOTWORKING){
                   mcf.getTable().setValueAt("Not Working", i, 4);
               }else if(status == Car.STATUS_WORKING){
                   mcf.getTable().setValueAt("Working", i, 4);
               }else if(status == Car.STATUS_FINISH){
                   mcf.getTable().setValueAt("Finish", i, 4);
               }else if(status == Car.STATUS_READY_TO_OUT){
                   mcf.getTable().setValueAt("Ready to out", i, 4);
               }
               mcf.getTable().setValueAt(date_in, i, 5);
               mcf.getTable().setValueAt(date_out, i, 6);
           }
    }
        
            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
