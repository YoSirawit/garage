
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class StuffPageController extends Online {
    private AccountManageFrame accFrame;
    
    public StuffPageController(){
        this.accFrame = new AccountManageFrame();
    }
    
    public AccountManageFrame getAccountFrame(){
        return this.accFrame;
    }
    
    public void update(){
        try{
            if(accFrame.getTable().getRowCount() != 0){
                System.out.println(accFrame.getTable().getRowCount());
                for(int i=accFrame.getTable().getRowCount()-1; i>=0; i--){
                    ((DefaultTableModel)accFrame.getTable().getModel()).removeRow(i);
                }
                System.out.println("after delete: " + accFrame.getTable().getRowCount());
            }
            ResultSet result = this.getStatement().executeQuery("select * from userid");
            int i = 0;
            while(result.next()){
                ((DefaultTableModel) accFrame.getTable().getModel()).addRow(new Object[0]);
                String f_name = result.getString(3);
                String l_name = result.getString(4);
                String user_name = result.getString(5);
                int user_level = result.getInt(2);
                
                accFrame.getTable().setValueAt(user_name, i, 0);
                accFrame.getTable().setValueAt(f_name, i, 1);
                accFrame.getTable().setValueAt(l_name, i, 2);
                accFrame.getTable().setValueAt(user_level, i, 3);
                i += 1;
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
    }
}
