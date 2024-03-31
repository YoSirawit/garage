import com.formdev.flatlaf.FlatLightLaf;
import java.sql.*;
import javax.swing.*;

public class ReceiptFrame extends javax.swing.JFrame implements ChangePageButton {
    public TestConnection db;
    
    public ReceiptFrame() {
        initComponents();
        setCar_owner();
        setCar_id();
        
    }
    
    private void setCar_owner(){
        try{
            db = new TestConnection();
            String sql = "SELECT car_owner FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) { // แสดงผลข้อมูลcar_ownerในตารางcar_list
                String carOwner = rs.getString("car_owner");
                switch(car_owner_index) {
                    case 0 -> car_owner1.setText("ชื่อ : " + carOwner);
                    case 1 -> car_owner2.setText("ชื่อ : " + carOwner);
                    case 2 -> car_owner3.setText("ชื่อ : " + carOwner);
                    case 3 -> car_owner4.setText("ชื่อ : " + carOwner);
                    case 4 -> car_owner5.setText("ชื่อ : " + carOwner);
                    case 5 -> car_owner6.setText("ชื่อ : " + carOwner);
                    case 6 -> car_owner7.setText("ชื่อ : " + carOwner);
                    case 7 -> car_owner8.setText("ชื่อ : " + carOwner);
                    case 8 -> car_owner9.setText("ชื่อ : " + carOwner);
                    case 9 -> car_owner10.setText("ชื่อ : " + carOwner);
                    default -> {
                    }
                }

                car_owner_index++; // เพิ่มลำดับ car_owner_index ที่จะแสดงข้อมูลในรอบถัดไป
            }

            } catch(SQLException sqle) {
                sqle.printStackTrace();

            }finally{
                db.close();
            }
    }
    private void setCar_id(){
        try{
            db = new TestConnection();
            String sql = "SELECT car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_id_index = 0;
            while (rs.next() && car_id_index <= 10) { // แสดงผลข้อมูลcar_idในตารางcar_list
                String carId = rs.getString("car_id");
                switch(car_id_index) {
                    case 0 -> car_id1.setText("เลขทะเบียน : " + carId);
                    case 1 -> car_id2.setText("เลขทะเบียน : " + carId);
                    case 2 -> car_id3.setText("เลขทะเบียน : " + carId);
                    case 3 -> car_id4.setText("เลขทะเบียน : " + carId);
                    case 4 -> car_id5.setText("เลขทะเบียน : " + carId);
                    case 5 -> car_id6.setText("เลขทะเบียน : " + carId);
                    case 6 -> car_id7.setText("เลขทะเบียน : " + carId);
                    case 7 -> car_id8.setText("เลขทะเบียน : " + carId);
                    case 8 -> car_id9.setText("เลขทะเบียน : " + carId);
                    case 9 -> car_id10.setText("เลขทะเบียน : " + carId);
                    default -> {
                    }
                }

                car_id_index++; // เพิ่มลำดับ car_id_index ที่จะแสดงข้อมูลในรอบถัดไป
            }

            } catch(SQLException sqle) {
                sqle.printStackTrace();

            }finally{
                db.close();
            }
        
    }
    static ResultSet getProductFromDB(String sql) {
        TestConnection db2 = new TestConnection();
        return db2.getConnect(sql);
    }
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
        jLabel1 = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        gridtop = new javax.swing.JPanel();
        slot1 = new javax.swing.JPanel();
        car_owner1 = new javax.swing.JLabel();
        car_id1 = new javax.swing.JLabel();
        ch1 = new javax.swing.JLabel();
        select1 = new javax.swing.JButton();
        slot2 = new javax.swing.JPanel();
        car_owner2 = new javax.swing.JLabel();
        car_id2 = new javax.swing.JLabel();
        ch2 = new javax.swing.JLabel();
        select2 = new javax.swing.JButton();
        slot3 = new javax.swing.JPanel();
        car_owner3 = new javax.swing.JLabel();
        car_id3 = new javax.swing.JLabel();
        ch3 = new javax.swing.JLabel();
        select3 = new javax.swing.JButton();
        slot4 = new javax.swing.JPanel();
        car_owner4 = new javax.swing.JLabel();
        car_id4 = new javax.swing.JLabel();
        select4 = new javax.swing.JButton();
        ch4 = new javax.swing.JLabel();
        slot5 = new javax.swing.JPanel();
        car_owner5 = new javax.swing.JLabel();
        car_id5 = new javax.swing.JLabel();
        ch5 = new javax.swing.JLabel();
        select5 = new javax.swing.JButton();
        gridbott = new javax.swing.JPanel();
        slot6 = new javax.swing.JPanel();
        car_owner6 = new javax.swing.JLabel();
        car_id6 = new javax.swing.JLabel();
        select6 = new javax.swing.JButton();
        ch6 = new javax.swing.JLabel();
        slot7 = new javax.swing.JPanel();
        car_owner7 = new javax.swing.JLabel();
        car_id7 = new javax.swing.JLabel();
        select7 = new javax.swing.JButton();
        ch7 = new javax.swing.JLabel();
        slot8 = new javax.swing.JPanel();
        car_owner8 = new javax.swing.JLabel();
        car_id8 = new javax.swing.JLabel();
        select8 = new javax.swing.JButton();
        ch8 = new javax.swing.JLabel();
        slot9 = new javax.swing.JPanel();
        car_owner9 = new javax.swing.JLabel();
        car_id9 = new javax.swing.JLabel();
        select9 = new javax.swing.JButton();
        ch9 = new javax.swing.JLabel();
        slot10 = new javax.swing.JPanel();
        car_owner10 = new javax.swing.JLabel();
        car_id10 = new javax.swing.JLabel();
        select10 = new javax.swing.JButton();
        ch10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        MenuBar.setBackground(new java.awt.Color(248, 245, 228));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\HomeOrange.png"));
        HomeButton.setText("หน้าหลัก");
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 220, 70));

        CustomButton.setBackground(new java.awt.Color(255, 102, 0));
        CustomButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CustomButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\CarManageOrange.png"));
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

        InvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        InvoiceButton.setForeground(new java.awt.Color(255, 102, 0));
        InvoiceButton.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\TestIcon\\InvoiceWhite.png"));
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

        getContentPane().add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(69, 69, 69));
        jPanel3.setForeground(new java.awt.Color(69, 69, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(69, 69, 69));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("เลือกรถเพื่อทำรายการ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 1, 1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        grid.setForeground(new java.awt.Color(51, 51, 51));
        grid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gridtop.setForeground(new java.awt.Color(51, 51, 51));

        slot1.setForeground(new java.awt.Color(51, 51, 51));

        car_owner1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner1.setText("<ว่าง>");

        car_id1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id1.setText("ทะเบียนรถ  : -");

        ch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        select1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select1.setText("เลือก");
        select1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot1Layout = new javax.swing.GroupLayout(slot1);
        slot1.setLayout(slot1Layout);
        slot1Layout.setHorizontalGroup(
            slot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car_id1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(car_owner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(slot1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        slot1Layout.setVerticalGroup(
            slot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(ch1)
                .addGap(18, 18, 18)
                .addComponent(car_owner1)
                .addGap(18, 18, 18)
                .addComponent(car_id1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select1)
                .addGap(16, 16, 16))
        );

        slot2.setForeground(new java.awt.Color(51, 51, 51));

        car_owner2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner2.setText("<ว่าง>");

        car_id2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id2.setText("ทะเบียนรถ  : -");

        ch2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        select2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select2.setText("เลือก");
        select2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot2Layout = new javax.swing.GroupLayout(slot2);
        slot2.setLayout(slot2Layout);
        slot2Layout.setHorizontalGroup(
            slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car_id2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(slot2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(car_owner2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        slot2Layout.setVerticalGroup(
            slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(ch2)
                .addGap(18, 18, 18)
                .addComponent(car_owner2)
                .addGap(18, 18, 18)
                .addComponent(car_id2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select2)
                .addGap(16, 16, 16))
        );

        car_owner3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner3.setText("<ว่าง>");

        car_id3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id3.setText("ทะเบียนรถ   : -");

        ch3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        select3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select3.setText("เลือก");
        select3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot3Layout = new javax.swing.GroupLayout(slot3);
        slot3.setLayout(slot3Layout);
        slot3Layout.setHorizontalGroup(
            slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot3Layout.createSequentialGroup()
                .addGroup(slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(car_id3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(car_owner3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(slot3Layout.createSequentialGroup()
                        .addGroup(slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(slot3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(slot3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(select3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        slot3Layout.setVerticalGroup(
            slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(ch3)
                .addGap(18, 18, 18)
                .addComponent(car_owner3)
                .addGap(18, 18, 18)
                .addComponent(car_id3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select3)
                .addGap(16, 16, 16))
        );

        car_owner4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner4.setText("<ว่าง>");

        car_id4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id4.setText("ทะเบียนรถ  : -");

        select4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select4.setText("เลือก");
        select4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select4ActionPerformed(evt);
            }
        });

        ch4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot4Layout = new javax.swing.GroupLayout(slot4);
        slot4.setLayout(slot4Layout);
        slot4Layout.setHorizontalGroup(
            slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(slot4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(select4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(slot4Layout.createSequentialGroup()
                .addGroup(slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_owner4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(slot4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(car_id4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        slot4Layout.setVerticalGroup(
            slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(ch4)
                .addGap(18, 18, 18)
                .addComponent(car_owner4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(car_id4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select4)
                .addGap(15, 15, 15))
        );

        car_owner5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner5.setText("<ว่าง>");

        car_id5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id5.setText("ทะเบียนรถ  : -");

        ch5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        select5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select5.setText("เลือก");
        select5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot5Layout = new javax.swing.GroupLayout(slot5);
        slot5.setLayout(slot5Layout);
        slot5Layout.setHorizontalGroup(
            slot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slot5Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addComponent(car_id5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(car_owner5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        slot5Layout.setVerticalGroup(
            slot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(ch5)
                .addGap(18, 18, 18)
                .addComponent(car_owner5)
                .addGap(18, 18, 18)
                .addComponent(car_id5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select5)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout gridtopLayout = new javax.swing.GroupLayout(gridtop);
        gridtop.setLayout(gridtopLayout);
        gridtopLayout.setHorizontalGroup(
            gridtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridtopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        gridtopLayout.setVerticalGroup(
            gridtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridtopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slot4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        grid.add(gridtop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        car_owner6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner6.setText("<ว่าง>");

        car_id6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id6.setText("ทะเบียนรถ  : -");

        select6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select6.setText("เลือก");
        select6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select6ActionPerformed(evt);
            }
        });

        ch6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot6Layout = new javax.swing.GroupLayout(slot6);
        slot6.setLayout(slot6Layout);
        slot6Layout.setHorizontalGroup(
            slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car_id6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(slot6Layout.createSequentialGroup()
                .addGroup(slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_owner6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(slot6Layout.createSequentialGroup()
                        .addGroup(slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(slot6Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(select6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(slot6Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ch6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        slot6Layout.setVerticalGroup(
            slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ch6)
                .addGap(18, 18, 18)
                .addComponent(car_owner6)
                .addGap(18, 18, 18)
                .addComponent(car_id6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        car_owner7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner7.setText("<ว่าง>");

        car_id7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id7.setText("ทะเบียนรถ  : -");

        select7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select7.setText("เลือก");
        select7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select7ActionPerformed(evt);
            }
        });

        ch7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot7Layout = new javax.swing.GroupLayout(slot7);
        slot7.setLayout(slot7Layout);
        slot7Layout.setHorizontalGroup(
            slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(car_owner7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                        .addComponent(select7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                        .addComponent(ch7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                        .addComponent(car_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        slot7Layout.setVerticalGroup(
            slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ch7)
                .addGap(18, 18, 18)
                .addComponent(car_owner7)
                .addGap(18, 18, 18)
                .addComponent(car_id7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        car_owner8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner8.setText("<ว่าง>");

        car_id8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id8.setText("ทะเบียนรถ  : -");

        select8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select8.setText("เลือก");
        select8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select8ActionPerformed(evt);
            }
        });

        ch8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot8Layout = new javax.swing.GroupLayout(slot8);
        slot8.setLayout(slot8Layout);
        slot8Layout.setHorizontalGroup(
            slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot8Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot8Layout.createSequentialGroup()
                        .addComponent(ch8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot8Layout.createSequentialGroup()
                        .addComponent(select8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(slot8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(car_owner8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(car_id8, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot8Layout.setVerticalGroup(
            slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ch8)
                .addGap(18, 18, 18)
                .addComponent(car_owner8)
                .addGap(18, 18, 18)
                .addComponent(car_id8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        car_owner9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner9.setText("<ว่าง>");

        car_id9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id9.setText("ทะเบียนรถ  : -");

        select9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select9.setText("เลือก");
        select9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select9ActionPerformed(evt);
            }
        });

        ch9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot9Layout = new javax.swing.GroupLayout(slot9);
        slot9.setLayout(slot9Layout);
        slot9Layout.setHorizontalGroup(
            slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slot9Layout.createSequentialGroup()
                        .addComponent(car_id9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ch9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(slot9Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(select9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(car_owner9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        slot9Layout.setVerticalGroup(
            slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ch9)
                .addGap(18, 18, 18)
                .addComponent(car_owner9)
                .addGap(18, 18, 18)
                .addComponent(car_id9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        car_owner10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_owner10.setText("<ว่าง>");

        car_id10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_id10.setText("ทะเบียนรถ  : -");

        select10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select10.setText("เลือก");
        select10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select10ActionPerformed(evt);
            }
        });

        ch10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout slot10Layout = new javax.swing.GroupLayout(slot10);
        slot10.setLayout(slot10Layout);
        slot10Layout.setHorizontalGroup(
            slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slot10Layout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(ch10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot10Layout.createSequentialGroup()
                        .addGroup(slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(car_id10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(car_owner10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        slot10Layout.setVerticalGroup(
            slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ch10)
                .addGap(18, 18, 18)
                .addComponent(car_owner10)
                .addGap(18, 18, 18)
                .addComponent(car_id10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gridbottLayout = new javax.swing.GroupLayout(gridbott);
        gridbott.setLayout(gridbottLayout);
        gridbottLayout.setHorizontalGroup(
            gridbottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridbottLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        gridbottLayout.setVerticalGroup(
            gridbottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridbottLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridbottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slot10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slot7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        grid.add(gridbott, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1060, 300));

        jPanel3.add(grid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 1080, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 0) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_1"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 1) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_2"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select2ActionPerformed

    private void select3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select3ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 2) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_3"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select3ActionPerformed

    private void select4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select4ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 3) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_4"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select4ActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed

        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 4) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_5"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select5ActionPerformed

    private void select6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select6ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 5) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_6"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select6ActionPerformed

    private void select7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select7ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 6) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_7"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select7ActionPerformed

    private void select8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select8ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 7) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_8"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select8ActionPerformed

    private void select9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select9ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 8) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_9"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select9ActionPerformed

    private void select10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select10ActionPerformed
        try {
            db = new TestConnection();
            String sql = "SELECT car_owner, car_id FROM car_list";
            ResultSet rs = db.getConnect(sql);
            int car_owner_index = 0;
            while (rs.next() && car_owner_index <= 10) {
                if (car_owner_index == 9) {
                    String carOwner = rs.getString("car_owner");
                    String carId = rs.getString("car_id");
                    ReceiptMDIApplication mdi = new ReceiptMDIApplication(getProductFromDB("SELECT * FROM bill_10"));
                    mdi.LinkData(carOwner,carId); // Set car_owner in ReceiptMDIApplication
                    mdi.setVisible(true);
                break;
                    }
                    car_owner_index++;
                }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            db.close();
        }
    }//GEN-LAST:event_select10ActionPerformed

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

    /**
     * @param args the command line arguments
     */
    

//    if(evt.getSource()==ch1){
//            ReceiptJInternalFrame internal = new ReceiptJInternalFrame();
//            internal.setVisible(true);
//            System.out.println("Hello");
    public static void main(String args[]) {
        try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
                SwingUtilities.invokeLater(() -> { ReceiptFrame frame = new ReceiptFrame(); });

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReceiptFrame rece = new ReceiptFrame();
                rece.setVisible(true);
                rece.setSize(1280, 720);
                rece.setTitle("ดำรงรวยการช่าง");
               

            }
        });
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
    private javax.swing.JLabel car_id1;
    private javax.swing.JLabel car_id10;
    private javax.swing.JLabel car_id2;
    private javax.swing.JLabel car_id3;
    private javax.swing.JLabel car_id4;
    private javax.swing.JLabel car_id5;
    private javax.swing.JLabel car_id6;
    private javax.swing.JLabel car_id7;
    private javax.swing.JLabel car_id8;
    private javax.swing.JLabel car_id9;
    private javax.swing.JLabel car_owner1;
    private javax.swing.JLabel car_owner10;
    private javax.swing.JLabel car_owner2;
    private javax.swing.JLabel car_owner3;
    private javax.swing.JLabel car_owner4;
    private javax.swing.JLabel car_owner5;
    private javax.swing.JLabel car_owner6;
    private javax.swing.JLabel car_owner7;
    private javax.swing.JLabel car_owner8;
    private javax.swing.JLabel car_owner9;
    private javax.swing.JLabel ch1;
    private javax.swing.JLabel ch10;
    private javax.swing.JLabel ch2;
    private javax.swing.JLabel ch3;
    private javax.swing.JLabel ch4;
    private javax.swing.JLabel ch5;
    private javax.swing.JLabel ch6;
    private javax.swing.JLabel ch7;
    private javax.swing.JLabel ch8;
    private javax.swing.JLabel ch9;
    private javax.swing.JPanel grid;
    private javax.swing.JPanel gridbott;
    private javax.swing.JPanel gridtop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton select1;
    private javax.swing.JButton select10;
    private javax.swing.JButton select2;
    private javax.swing.JButton select3;
    private javax.swing.JButton select4;
    private javax.swing.JButton select5;
    private javax.swing.JButton select6;
    private javax.swing.JButton select7;
    private javax.swing.JButton select8;
    private javax.swing.JButton select9;
    private javax.swing.JPanel slot1;
    private javax.swing.JPanel slot10;
    private javax.swing.JPanel slot2;
    private javax.swing.JPanel slot3;
    private javax.swing.JPanel slot4;
    private javax.swing.JPanel slot5;
    private javax.swing.JPanel slot6;
    private javax.swing.JPanel slot7;
    private javax.swing.JPanel slot8;
    private javax.swing.JPanel slot9;
    private javax.swing.JPanel usernamePn1;
    private javax.swing.JLabel usernameTxt1;
    // End of variables declaration//GEN-END:variables

        
    @Override
    public JButton getHomeButton(){
        return this.HomeButton;
    }
    @Override
    public JButton getManagementButton(){
        return this.CustomButton;
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
    public JButton getReceiptButton() {
        return null;
    }

    @Override
    public JButton getStuffManageButton() {
        return this.AccountButton;
    }
    
     public JLabel getUsernameLabel(){
        return this.usernameTxt1;
    }
     
    public void update(){
        for(int car_id_index = 0; car_id_index<10; car_id_index++){
           switch(car_id_index) {
                case 0 -> {car_owner1.setText("<ว่าง>"); car_id1.setText("ทะเบียนรถ   : -");}
                case 1 -> {car_owner2.setText("<ว่าง>");car_id2.setText("ทะเบียนรถ   : -");}
                case 2 -> {car_owner3.setText("<ว่าง>");car_id3.setText("ทะเบียนรถ   : -");}
                case 3 -> {car_owner4.setText("<ว่าง>");car_id4.setText("ทะเบียนรถ   : -");}
                case 4 -> {car_owner5.setText("<ว่าง>");car_id5.setText("ทะเบียนรถ   : -");}
                case 5 -> {car_owner6.setText("<ว่าง>");car_id6.setText("ทะเบียนรถ   : -");}
                case 6 -> {car_owner7.setText("<ว่าง>");car_id7.setText("ทะเบียนรถ   : -");}
                case 7 -> {car_owner8.setText("<ว่าง>");car_id8.setText("ทะเบียนรถ   : -");}
                case 8 -> {car_owner9.setText("<ว่าง>");car_id9.setText("ทะเบียนรถ   : -");}
                case 9 -> {car_owner10.setText("<ว่าง>");car_id10.setText("ทะเบียนรถ   : -");}
                default -> {
                }
            } 
        }
        

        setCar_owner();
        setCar_id();
    }
}
