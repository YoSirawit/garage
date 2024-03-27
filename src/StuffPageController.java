
import java.awt.event.*;
import javax.swing.*;

public class StuffPageController {
    private AccountManageFrame accFrame;
    
    public StuffPageController(){
        this.accFrame = new AccountManageFrame();
    }
    
    public AccountManageFrame getAccountFrame(){
        return this.accFrame;
    }
}
