import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddMDIFrame extends javax.swing.JFrame {
    private Bill bill;
    private Car car;
    
    /**
     * Creates new form AddMDIFrame
     */
    public AddMDIFrame() {
        this(null);
    }
    public AddMDIFrame(Car car){
        this.car = car;
        initComponents();
        this.bill = car.getBill();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        QuantityField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 184, 0));
        jPanel1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("JasmineUPC", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 184, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("---->");

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 184, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("JasmineUPC", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 184, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("<----");

        jLabel3.setFont(new java.awt.Font("JasmineUPC", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 184, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID :");

        jLabel7.setFont(new java.awt.Font("JasmineUPC", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 184, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Quantity :");

        idField.setBackground(new java.awt.Color(233, 233, 233));
        idField.setFont(new java.awt.Font("JasmineUPC", 0, 30)); // NOI18N
        idField.setForeground(new java.awt.Color(255, 184, 0));
        idField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        QuantityField.setBackground(new java.awt.Color(233, 233, 233));
        QuantityField.setFont(new java.awt.Font("JasmineUPC", 0, 30)); // NOI18N
        QuantityField.setForeground(new java.awt.Color(255, 184, 0));
        QuantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityFieldActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(255, 0, 0));
        AddButton.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add to Cart");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel6.getAccessibleContext().setAccessibleParent(jPanel2);
        jLabel1.getAccessibleContext().setAccessibleParent(jPanel2);
        jLabel5.getAccessibleContext().setAccessibleParent(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try {
            // TODO add your handling code here:d
            TestConnection db = new TestConnection();
            ResultSet rs = db.getConnect(String.format("select item_name, price from inventory where ID=%d",Integer.parseInt(idField.getText())));
            rs.next();
            Item item = new Item(rs.getString(1), Integer.parseInt(QuantityField.getText()), Double.parseDouble(rs.getString(2)));
            bill.addItem(item);
            String decrease = String.format("UPDATE inventory SET quantity= quantity - %d WHERE ID= %d", Integer.parseInt(QuantityField.getText()), Integer.parseInt(idField.getText()));
            db.getUpdate(decrease);
            String getCarCh = String.format("select ch from car_list where car_id = '%s'", this.car.getCarID());
            rs = db.getConnect(getCarCh);
            rs.next();
            int ch = rs.getInt(1);
            String checkItem = "";
            switch(ch){
                case 1 -> {
                    checkItem = String.format("select * from bill_1 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_1 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_1(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 2 -> {
                    checkItem = String.format("select * from bill_2 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_2 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_2(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 3 -> {
                    checkItem = String.format("select * from bill_3 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_3 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_3(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 4 -> {
                    checkItem = String.format("select * from bill_4 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_4 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_4(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 5 -> {
                    checkItem = String.format("select * from bill_5 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_5 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_5(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 6 -> {
                    checkItem = String.format("select * from bill_6 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_6 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_6(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 7 -> {
                    checkItem = String.format("select * from bill_7 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_7 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_7(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 8 -> {
                    checkItem = String.format("select * from bill_8 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_8 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_8(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 9 -> {
                    checkItem = String.format("select * from bill_9 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_9 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_9(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
                case 10 -> {
                    checkItem = String.format("select * from bill_10 where Name = '%s'", item.getName());
                    rs = db.getConnect(checkItem);
                    if(rs.next()){
                        String addItem = String.format("update bill_10 set Quantity = Quantity + %d where Name = '%s'", item.getVolume(), item.getName());
                        db.getUpdate(addItem);
                    }else{
                        String addNewItem = String.format("insert into bill_10(Name, Quantity, Price_Per_Piece) values('%s', %d, %f)", item.getName(), item.getVolume(), item.getPrice());
                        db.getUpdate(addNewItem);
                    }
                }
            }
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AddMDIFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddMDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMDIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMDIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
