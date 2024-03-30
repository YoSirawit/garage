
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.*;

public class ConfigCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component def = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        ActionPanel ap = new ActionPanel();
        return ap;
    }
    
}
