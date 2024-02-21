import java.sql.*;

public class LoginManager {
    Statement statement;
    Account acct;
    
    public LoginManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_connector.getUrl(), DB_connector.getUsername(), DB_connector.getPassword());
            statement = conn.createStatement();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public boolean login(String username, String password){
        try {
            ResultSet result = statement.executeQuery("select * from userid where username = \""+username+"\" and user_pass = md5(\""+password+"\")");
            if(result.next()){
                acct = new Account(result.getString(5), result.getString(3), result.getString(4), result.getInt(2), result.getInt(1));
                return true;
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    
    public Account getAccount(){
        return this.acct;
    }
}
