
import javax.swing.table.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class ManageCarFrame extends javax.swing.JFrame implements ChangePageButton {

    /**
     * Creates new form ManageCarFrame
     * @param tav
     */
    public ManageCarFrame(TableActionEvent tav) {
        initComponents();
        this.jTable2.getColumnModel().getColumn(7).setCellRenderer(new ConfigCellRenderer());
        this.jTable2.getColumnModel().getColumn(7).setCellEditor(new CustomCellEditor(tav));
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        usernamePn1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernameTxt1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        CustomButton = new javax.swing.JButton();
        EquipmentButton = new javax.swing.JButton();
        WarehouseButton = new javax.swing.JButton();
        InvoiceButton = new javax.swing.JButton();
        AccountButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Header.setBackground(new java.awt.Color(247, 127, 0));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernamePn1.setBackground(new java.awt.Color(247, 127, 0));
        usernamePn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/userWithcircle.png"))); // NOI18N
        usernamePn1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        usernameTxt1.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt1.setText("@USERNAME");
        usernameTxt1.setToolTipText("Username Account");
        usernameTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usernamePn1.add(usernameTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 30));

        Header.add(usernamePn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 130, 30));

        jLabel4.setBackground(new java.awt.Color(242, 157, 0));
        jLabel4.setFont(new java.awt.Font("IrisUPC", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ดำรงรวยการช่าง ");
        Header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        MenuBar.setBackground(new java.awt.Color(248, 245, 228));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\HomeOrange.png"));
        HomeButton.setText("หน้าหลัก");
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 220, 70));

        CustomButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomButton.setForeground(new java.awt.Color(255, 102, 0));
        CustomButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\CarManageWhite.png"));
        CustomButton.setText("จัดการคิวรถ");
        CustomButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomButtonActionPerformed(evt);
            }
        });
        MenuBar.add(CustomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 220, 70));

        EquipmentButton.setBackground(new java.awt.Color(255, 102, 0));
        EquipmentButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EquipmentButton.setForeground(new java.awt.Color(255, 255, 255));
        EquipmentButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\ShopOrange.png"));
        EquipmentButton.setText("เบิกอุปกรณ์");
        EquipmentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentButtonActionPerformed(evt);
            }
        });
        MenuBar.add(EquipmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 220, 70));

        WarehouseButton.setBackground(new java.awt.Color(255, 102, 0));
        WarehouseButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        WarehouseButton.setForeground(new java.awt.Color(255, 255, 255));
        WarehouseButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\StorageOrange.png"));
        WarehouseButton.setText("คลังอุปกรณ์");
        WarehouseButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        WarehouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarehouseButtonActionPerformed(evt);
            }
        });
        MenuBar.add(WarehouseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 330, 220, 70));

        InvoiceButton.setBackground(new java.awt.Color(255, 102, 0));
        InvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InvoiceButton.setForeground(new java.awt.Color(255, 255, 255));
        InvoiceButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\InvoiceOrange.png"));
        InvoiceButton.setText("ใบเสร็จ");
        InvoiceButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceButtonActionPerformed(evt);
            }
        });
        MenuBar.add(InvoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 220, 70));

        AccountButton.setBackground(new java.awt.Color(255, 102, 0));
        AccountButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AccountButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\AccountOrange.png"));
        AccountButton.setText("จัดการพนักงาน");
        AccountButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountButtonActionPerformed(evt);
            }
        });
        MenuBar.add(AccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 220, 70));

        getContentPane().add(MenuBar, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ch", "ID", "brand", "model", "status", "date_in", "date_out", "config"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(2);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/PlusWhitejing.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 613, 60, 70));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void CustomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomButtonActionPerformed

    private void EquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipmentButtonActionPerformed

    private void WarehouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarehouseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarehouseButtonActionPerformed

    private void InvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceButtonActionPerformed

    private void AccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void populateTable(){
        String columns[] = {"ID", "ch", "reg_number", "brand", "name", "status", "date_in", "date_out"};
        String data[][] = {{""}
            
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        jTable2.setModel(model);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageCarFrame mcf = new ManageCarFrame(null);
                mcf.setVisible(true);
                mcf.setSize(1280, 720);
                mcf.setTitle("ดำรงรวยการช่าง");

            }
        });
    }
    
    @Override
    public JButton getHomeButton(){
        return this.HomeButton;
    }
    
    @Override
    public JButton getEquipmentButton(){
        return this.EquipmentButton;
    }
    
    @Override
    public JButton getWarehouseButton(){
        return this.WarehouseButton;
    }
    
    @Override
    public JButton getReceiptButton(){
        return this.InvoiceButton;
    }
    
    public JTable getTable(){
        return this.jTable2;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountButton;
    private javax.swing.JButton CustomButton;
    private javax.swing.JButton EquipmentButton;
    private javax.swing.JPanel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton WarehouseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel usernamePn1;
    private javax.swing.JLabel usernameTxt1;
    // End of variables declaration//GEN-END:variables

    @Override
    public JButton getManagementButton() {
        return null;
    }

    @Override
    public JButton getStuffManageButton() {
        return this.AccountButton;
    }
    
     public JLabel getUsernameLabel(){
        return this.usernameTxt1;
    }
}
