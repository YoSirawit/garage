import java.sql.*;

public class LoginManager extends Online {
    private Account acct;
    
    public LoginManager(){
        acct = null;
    }
    
    public boolean login(String username, String password){
        try {
            ResultSet result = this.getStatement().executeQuery("select * from userid where username = \""+username+"\" and user_pass = md5(\""+password+"\")");
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
