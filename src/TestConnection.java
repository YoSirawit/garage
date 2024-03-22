import java.sql.*;
public class TestConnection extends Online{
//    public Statement statement;
    public Connection conn;
    public ResultSet rs;
    public TestConnection(){
        super();
    }
    @Override
    public void db_connect() {
        try {
            conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // to link with database and to get value of data
    // Thai ver เชื่อมต่อกับฐานข้อมูล กับ ดึงข้อมูล
    public ResultSet getConnect(String sql){
        
        try{
//            conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
            //use statement to run sql by using conn
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
    // insert update delete
    public void getUpdate(String sql){
        try{
            statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //close thor 
    // Thai ver : ปิดการเชื่อมต่อกับฐานข้อมูล
    public void close(){
        try{
            statement.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
//    @Override
//    public Statement getStatement(){
//        return this.statement;
//    }
//
//}
