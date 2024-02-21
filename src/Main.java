
public class Main {
    public static void main(String[] args) {
        LoginManager lm = new LoginManager();
        if(lm.login("admin", "1234")){
            System.out.println("Username : " + lm.getAccount().getUsername());
            System.out.println("FirstName : " + lm.getAccount().getFirstName());
            System.out.println("LastName : " + lm.getAccount().getLastName());
            System.out.println("Level : " + lm.getAccount().getLevel());
        } else {
            System.out.println("No username or wrong password");
        }
    }
}
