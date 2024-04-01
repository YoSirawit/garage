
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class StuffPageController extends Online {
    private AccountManageFrame accFrame;
    
    public StuffPageController(LoginManager lm, JDesktopPane desktop_pane){
        StuffPageController spc = this;
        TableActionEvent tav = new TableActionEvent() {
            @Override
            public void view(int row) {
                // open staffInfo InternalFrame
                String userName = (String)accFrame.getTable().getValueAt(row, 0);
                try{
                    String sql = String.format("select * from userid where username = '%s'", userName);
                    ResultSet result = getStatement().executeQuery(sql);
                    result.next();
                    int level = result.getInt(2);
                    String f_name = result.getString(3);
                    String l_name = result.getString(4);
                    String email = result.getString(7);
                    String phone = result.getString(8);
                    JInternalFrame inFrame = new JInternalFrame("Stuff Info", false, true, false, true);
                    StuffInfoPanel stuff_info = new StuffInfoPanel(userName, f_name, l_name, email, phone, level, inFrame);
                    inFrame.add(stuff_info);
                    inFrame.pack();
                    inFrame.setVisible(true);
                    desktop_pane.add(inFrame);
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
                
            }

            @Override
            public void edit(int row) {
                //open editStaffInfo InternalFrame
                String userName = (String)accFrame.getTable().getValueAt(row, 0);
                try{
                    String sql = String.format("select * from userid where username = '%s'", userName);
                    ResultSet result = getStatement().executeQuery(sql);
                    result.next();
                    int level = result.getInt(2);
                    String f_name = result.getString(3);
                    String l_name = result.getString(4);
                    String email = result.getString(7);
                    String phone = result.getString(8);
                    JInternalFrame inFrame = new JInternalFrame("Stuff Info", false, true, false, true);
                    StuffEditPanel stuff_edit = new StuffEditPanel(userName, f_name, l_name, email, phone, level, inFrame, spc);
                    inFrame.add(stuff_edit);
                    inFrame.pack();
                    inFrame.setVisible(true);
                    desktop_pane.add(inFrame);
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
            }

            @Override
            public void del(int row) {
                //delete staff info
                String username = (String)accFrame.getTable().getValueAt(row, 0);
                try{
                    getStatement().executeUpdate(String.format("delete from userid where username = '%s'", username));
                }catch(SQLException sqle){
                    sqle.printStackTrace();
                }
                update();
            }
        };
        this.accFrame = new AccountManageFrame(lm, tav);
    }
    
    public AccountManageFrame getAccountFrame(){
        return this.accFrame;
    }
    
    public void update(){
        //update staffInfoTable
        try{
            if(accFrame.getTable().getRowCount() != 0){
                for(int i=accFrame.getTable().getRowCount()-1; i>=0; i--){
                    ((DefaultTableModel)accFrame.getTable().getModel()).removeRow(i);
                }
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
