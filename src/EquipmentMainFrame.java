
import javax.swing.*;
public class EquipmentMainFrame extends javax.swing.JFrame implements ChangePageButton {

    private Garage gr;
    private Car car;
    public EquipmentMainFrame(Garage gr) {
        initComponents();
        this.gr = gr;
        checkslot();
    }
    
    public EquipmentMainFrame(){
        this(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.*&*
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        usernamePn1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernameTxt1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        HomeButton1 = new javax.swing.JButton();
        CustomButton = new javax.swing.JButton();
        EquipmentButton = new javax.swing.JButton();
        WarehouseButton = new javax.swing.JButton();
        InvoiceButton = new javax.swing.JButton();
        AccountButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        MenuBar.setBackground(new java.awt.Color(248, 245, 228));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton1.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HomeButton1.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/HomeOrange.png"))); // NOI18N
        HomeButton1.setText("หน้าหลัก");
        HomeButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton1ActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 220, 70));

        CustomButton.setBackground(new java.awt.Color(255, 102, 0));
        CustomButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/CarManageOrange.png"))); // NOI18N
        CustomButton.setText("จัดการคิวรถ");
        CustomButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomButtonActionPerformed(evt);
            }
        });
        MenuBar.add(CustomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 220, 70));

        EquipmentButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EquipmentButton.setForeground(new java.awt.Color(255, 102, 0));
        EquipmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/ShopWhite.png"))); // NOI18N
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
        WarehouseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/StorageOrange.png"))); // NOI18N
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
        InvoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/InvoiceOrange.png"))); // NOI18N
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
        AccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/AccountOrange.png"))); // NOI18N
        AccountButton.setText("จัดการพนักงาน");
        AccountButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountButtonActionPerformed(evt);
            }
        });
        MenuBar.add(AccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 530, 220, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButton1ActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EquipmentMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipmentMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipmentMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipmentMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EquipmentMainFrame eqm = new EquipmentMainFrame();
                eqm.setSize(1280,720);
                eqm.setVisible(true);
            }
        });
    }
    public void checkslot(){
        jPanel2.removeAll();
        jPanel3.removeAll();
        for (int i=0;i<10;i++){
            if(i<5){
                if (this.gr.getCh(i).getCar() != null){
                    car = this.gr.getCh(i).getCar();
                    Slotcar1 sc1 = new Slotcar1(car);
                    jPanel2.add(sc1);
                    sc1.setnum(i+1);
                    sc1.setVisible(true);
                }else{
                    Slotcar2 sc2 = new Slotcar2();
                    jPanel2.add(sc2);
                    sc2.setnum(i+1);
                    sc2.setVisible(true);
                }
            }else{
                if(this.gr.getCh(i).getCar() != null){
                    car = this.gr.getCh(i).getCar();
                    Slotcar1 sc1 = new Slotcar1(car);
                    jPanel3.add(sc1);
                    sc1.setnum(i+1);
                    sc1.setVisible(true);
                }else{
                    Slotcar2 sc2 = new Slotcar2();
                    jPanel3.add(sc2);
                    sc2.setnum(i+1);
                    sc2.setVisible(true);
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountButton;
    private javax.swing.JButton CustomButton;
    private javax.swing.JButton EquipmentButton;
    private javax.swing.JPanel Header;
    private javax.swing.JButton HomeButton1;
    private javax.swing.JButton InvoiceButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton WarehouseButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    private javax.swing.JPanel usernamePn1;
    private javax.swing.JLabel usernameTxt1;
    // End of variables declaration//GEN-END:variables

//    public void update(){
//        this.JPanelCenter.removeAll();
//        this.JPanelCenter.revalidate();
//        for(int i=0; i<garage_ch.length; i++){
//            Car tmp = garage_ch[i].getCar();
//            if(tmp != null){
//                this.JPanelCenter.add(new Slotcar(tmp.getCarID(), tmp.getCarOwner(), tmp.getCarName(), tmp.getBrand()));
//            }
//            
//        }
//        this.JPanelCenter.revalidate();
//        this.JPanelCenter.repaint();
//        this.repaint();
//    }
//    
    
    @Override
    public JButton getHomeButton() {
        return this.HomeButton1;
    }

    @Override
    public JButton getManagementButton() {
        return this.CustomButton;
    }

    @Override
    public JButton getEquipmentButton() {
        return this.EquipmentButton;
    }

    @Override
    public JButton getReceiptButton() {
        return this.InvoiceButton;
    }

    @Override
    public JButton getWarehouseButton() {
        return this.WarehouseButton;
    }

    @Override
    public JButton getStuffManageButton() {
        return this.AccountButton;
    }
    
     public JLabel getUsernameLabel(){
        return this.usernameTxt1;
    }
}
