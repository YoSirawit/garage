import java.sql.*;
import java.util.*;

public class ReceiptMDIApplication extends javax.swing.JFrame {
    private TestConnection db;
    private Bill bill;
    private String[] info;
    private int billIndex;
    private ResultSet product;
    private double totalPrice;
    
    public ReceiptMDIApplication(ResultSet product, String[] info, int billIndex, double totalPrice) {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.info = info;
        this.billIndex = billIndex;
        this.totalPrice = totalPrice;
        bill = new Bill();
        try {
                while (true) {
                    if (product.next()) {
                    Item item = new Item(product.getString(1), product.getInt(2), product.getDouble(3));
                    bill.addItem(item);
                    } else {
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        this.showItem();
        totalTextField.setText(String.valueOf(totalPrice));
    }
    
    public void LinkData(String carOwner,String carId) {
        try {
            String carowner = "ชื่อ : " + carOwner;
            String carid = "เลขทะเบียน : " + carId;
            car_owner.setText(carowner);
            car_id.setText(carid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //For show each item on JTextArea1
    private void showItem() {
        List<Item> itemList = bill.getInfo();
        for (Item item:itemList) {
            this.jTextArea1.append(String.format("%s (%.2f) x%d\t\ttotal %.2f baht\n", item.getName(), item.getPrice(), item.getVolume(), item.getTotal()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        car_owner = new javax.swing.JLabel();
        car_id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totaltext1 = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        totaltext = new javax.swing.JLabel();
        wageTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 127, 0));

        desktopPane.setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setBackground(new java.awt.Color(247, 127, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายการค่าใช้จ่าย");

        car_owner.setBackground(new java.awt.Color(51, 51, 51));
        car_owner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner.setText("ชื่อ : ");
        car_owner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id.setText("เลขทะเบียน : ");
        car_id.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totaltext1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        totaltext1.setText("รวมทั้งหมดคิดเป็น");
        jPanel3.add(totaltext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 30));

        totalTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        totalTextField.setForeground(new java.awt.Color(255, 255, 255));
        totalTextField.setText("ราคา");
        totalTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        totalTextField.setEnabled(false);
        jPanel3.add(totalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 260, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("บาท");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totaltext.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        totaltext.setText("ค่าแรง");
        jPanel5.add(totaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        wageTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        wageTextField.setText("รายการ");
        wageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wageTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(wageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 310, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("บาท");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

        priceTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        priceTextField.setText("ราคา");
        jPanel5.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 260, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ออกบิล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(car_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(car_owner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(car_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(317, 317, 317)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wageTextFieldActionPerformed
       
    //Open invoice pdf file
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                try {
            InvoiceCreator invoice = new InvoiceCreator(bill, info);
        } catch (Exception ex) {
            System.out.println("Something wrong.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Add wage and price on JTextArea1 database + update bill
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        db = new TestConnection();
        switch (billIndex) {
            case 1 -> {
                db.getUpdate(String.format("INSERT INTO bill_1 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));
                product = db.getConnect("SELECT * FROM bill_1");
            }
            case 2 -> {
                db.getUpdate(String.format("INSERT INTO bill_2 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_2");
            }
            case 3 -> {
                db.getUpdate(String.format("INSERT INTO bill_3 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_3");
            }
            case 4 -> {
                db.getUpdate(String.format("INSERT INTO bill_4 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_4");
            }
            case 5 -> {
                db.getUpdate(String.format("INSERT INTO bill_5 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_5");
            }
            case 6 -> {
                db.getUpdate(String.format("INSERT INTO bill_6 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_6");
            }
            case 7 -> {
                db.getUpdate(String.format("INSERT INTO bill_7 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_7");
            }
            case 8 -> {
                db.getUpdate(String.format("INSERT INTO bill_8 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_8");
            }
            case 9 -> {
                db.getUpdate(String.format("INSERT INTO bill_9 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_9");
            }
            case 10 -> {
                db.getUpdate(String.format("INSERT INTO bill_10 (Name,Quantity,Price_Per_Piece) VALUES ('%s',1,%f)", this.wageTextField.getText(),Double.parseDouble(this.priceTextField.getText())));                
                product = db.getConnect("SELECT * FROM bill_10");
            }
        }
        this.jTextArea1.append(String.format("%s (%.2f) x1\t\ttotal %.2f baht\n", this.wageTextField.getText(), Double.parseDouble(this.priceTextField.getText()),Double.parseDouble(this.priceTextField.getText())));
        bill = new Bill();
        try {
                while (true) {
                    if (product.next()) {
                    Item item = new Item(product.getString(1), product.getInt(2), product.getDouble(3));
                    bill.addItem(item);
                    } else {
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReceiptMDIApplication().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel car_id;
    private javax.swing.JLabel car_owner;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField totalTextField;
    private javax.swing.JLabel totaltext;
    private javax.swing.JLabel totaltext1;
    private javax.swing.JTextField wageTextField;
    // End of variables declaration//GEN-END:variables

}
