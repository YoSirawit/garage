
import java.awt.Component;
import javax.swing.*;




public class CustomCellEditor extends DefaultCellEditor {
    private TableActionEvent tav;

    public CustomCellEditor(TableActionEvent ev) {
        super(new JCheckBox());
        this.tav = ev;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
//        return super.getTableCellEditorComponent(table, value, isSelected, row, column);
        ActionPanel ap = new ActionPanel();
        ap.addEvent(tav, row);
        ap.setBackground(table.getSelectionBackground());
        return ap;

    }
    
}