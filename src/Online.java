
import java.sql.*;

public abstract class Online implements NeedDB {  
    public Statement statement;
    
    public Online(){
        db_connect();
    }
    
    
    @Override
    public void db_connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
            statement = conn.createStatement();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public Statement getStatement(){
        return this.statement;
    }
}