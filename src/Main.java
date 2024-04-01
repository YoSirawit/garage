
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch(UnsupportedLookAndFeelException ex){
            ex.printStackTrace();
        }
        SwingUtilities.invokeLater(()->{MainController mc = new MainController(); });
        
    }
    
//    public static void main(String[] args) {
//        LoginManager lm = new LoginManager();
//        if(lm.login("admin", "1234")){
//            System.out.println("Username : " + lm.getAccount().getUsername());
//            System.out.println("FirstName : " + lm.getAccount().getFirstName());
//            System.out.println("LastName : " + lm.getAccount().getLastName());
//            System.out.println("Level : " + lm.getAccount().getLevel());
//        } else {
//            System.out.println("No username or wrong password");
//        }
//    }
}
