import java.sql.*;

public class Account {
    private String username;
    private String firstName;
    private String lastName;
    private int level;
    private int id;
    public Statement statement;
    public Account(String username, String firstName, String lastName, int level, int id){
            
            this.level = level;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.id = id;
 
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
   public int getId(){
       return this.id;
   }
}
