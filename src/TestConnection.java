import java.sql.*;
public class TestConnection extends Online{
    private Connection conn;
    private ResultSet rs;
    public TestConnection(){
        //super(Online class)
        super();
    }
    @Override
    public void db_connect() {
    // to connect with database and to get data
    // Thai ver เชื่อมต่อกับฐานข้อมูล กับ ดึงข้อมูล
        try {
            conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getConnect(String sql){
    //executes sql query
    //Thai ver ดึงข้อมูลจาก query database
        try{
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public void getUpdate(String sql){
    //modifies the database such as insert, update 
        try{
            statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    public void close(){
    //close thor database
    // Thai ver : ปิดการเชื่อมต่อกับฐานข้อมูล
        try{
            statement.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

