import java.sql.*;

public class Account {
    private String username;
    private String firstName;
    private String lastName;
    private int level;
    public Statement statement;
    public Account(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
            statement = conn.createStatement();
            
            ResultSet result = statement.executeQuery("select * from userid");
            result.next();
            
            this.level = result.getInt(2);
            this.firstName = result.getString(3);
            this.lastName = result.getString(4);
            this.username = result.getString(5);
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
   
    public String getUsername(){
        return this.username;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getLevel(){
        return this.level;
    }
   
}
