
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class GarageController extends Online implements ActionListener {
    private Garage gr;
    private ManageCarFrame mcf;
    private TableActionEvent tav;
    
    public GarageController(JDesktopPane desktop_pane){
        super();
        this.gr = new Garage();
        GarageController gc = this;
        this.tav = new TableActionEvent() {
            @Override
            public void view(int row) {
                JInternalFrame inFrame = new JInternalFrame("View "+row, false, true, false, true);
                int slot = (int) mcf.getTable().getValueAt(row, 0);
                String id = (String)mcf.getTable().getValueAt(row, 1);
                String model = (String) mcf.getTable().getValueAt(row, 3);
                String status = (String)mcf.getTable().getValueAt(row, 4);
                try{
                    ResultSet result = getStatement().executeQuery("select car_owner from car_list where ch = "+slot);
                    if(result.next()){
                        String customer_name = result.getString(1);
                        inFrame.add(new CarInfoPanel(slot, customer_name, id, model, status));
                        inFrame.pack();
                        inFrame.setVisible(true);
                        desktop_pane.add(inFrame);
                        desktop_pane.repaint();
                    }else{
                        JOptionPane.showMessageDialog(desktop_pane, "This channel doesn't have car", "Alert", JOptionPane.PLAIN_MESSAGE);
                    }
                    
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
                System.out.println("view : "+row);
            }

            @Override
            public void edit(int row) {
                JInternalFrame inFrame = new JInternalFrame("Edit "+row, false, true, false, true);
                int slot = (int) mcf.getTable().getValueAt(row, 0);
                String id = (String)mcf.getTable().getValueAt(row, 1);
                String brand = (String)mcf.getTable().getValueAt(row, 2);
                String model = (String) mcf.getTable().getValueAt(row, 3);
                String status = (String)mcf.getTable().getValueAt(row, 4);
                String date_in = (String)mcf.getTable().getValueAt(row, 5);
                String date_out = (String)mcf.getTable().getValueAt(row, 6);
                try{
                    ResultSet result = getStatement().executeQuery("select car_owner from car_list where ch = "+slot);
                    if(result.next()){
                        String customer_name = result.getString(1);
                        inFrame.add(new CarConfigPanel(slot, customer_name, id, brand, model, status, date_in, date_out, gc, inFrame));
                        inFrame.pack();
                        inFrame.setVisible(true);
                        desktop_pane.add(inFrame);
                        desktop_pane.repaint();
                    }else{
                        JOptionPane.showMessageDialog(desktop_pane, "This channel doesn't have car", "Alert", JOptionPane.PLAIN_MESSAGE);
                    }
                    
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
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
