
import javax.swing.*;
import java.awt.event.*;



public class ReceiptController {
    private ReceiptFrame rf;
    private Channel[] ch;
    
    public ReceiptController(Channel[] ch){
        this.rf = new ReceiptFrame();
        // get slot in garage
        this.ch = ch; // intend to pass it into ReceiptFrame
    }
    
    public ReceiptFrame getReceiptFrame(){
        return this.rf;
    }
}
