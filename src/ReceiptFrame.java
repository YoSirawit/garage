import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class ReceiptFrame extends javax.swing.JFrame {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        logPanel = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        gridtop = new javax.swing.JPanel();
        slot1 = new javax.swing.JPanel();
        ch1 = new javax.swing.JLabel();
        car_owner1 = new javax.swing.JLabel();
        car_id1 = new javax.swing.JLabel();
        select1 = new javax.swing.JButton();
        slot2 = new javax.swing.JPanel();
        ch2 = new javax.swing.JLabel();
        car_owner2 = new javax.swing.JLabel();
        car_id2 = new javax.swing.JLabel();
        select2 = new javax.swing.JButton();
        slot3 = new javax.swing.JPanel();
        ch3 = new javax.swing.JLabel();
        car_owner3 = new javax.swing.JLabel();
        car_id3 = new javax.swing.JLabel();
        select3 = new javax.swing.JButton();
        slot4 = new javax.swing.JPanel();
        ch4 = new javax.swing.JLabel();
        car_owner4 = new javax.swing.JLabel();
        car_id4 = new javax.swing.JLabel();
        select4 = new javax.swing.JButton();
        slot5 = new javax.swing.JPanel();
        ch5 = new javax.swing.JLabel();
        car_owner5 = new javax.swing.JLabel();
        car_id5 = new javax.swing.JLabel();
        select5 = new javax.swing.JButton();
        gridbott = new javax.swing.JPanel();
        slot6 = new javax.swing.JPanel();
        ch6 = new javax.swing.JLabel();
        car_owner6 = new javax.swing.JLabel();
        car_id6 = new javax.swing.JLabel();
        select6 = new javax.swing.JButton();
        slot7 = new javax.swing.JPanel();
        ch7 = new javax.swing.JLabel();
        car_owner7 = new javax.swing.JLabel();
        car_id7 = new javax.swing.JLabel();
        select7 = new javax.swing.JButton();
        slot8 = new javax.swing.JPanel();
        ch8 = new javax.swing.JLabel();
        car_owner8 = new javax.swing.JLabel();
        car_id8 = new javax.swing.JLabel();
        select8 = new javax.swing.JButton();
        slot9 = new javax.swing.JPanel();
        ch9 = new javax.swing.JLabel();
        car_owner9 = new javax.swing.JLabel();
        car_id9 = new javax.swing.JLabel();
        select9 = new javax.swing.JButton();
        slot10 = new javax.swing.JPanel();
        ch10 = new javax.swing.JLabel();
        car_owner10 = new javax.swing.JLabel();
        car_id10 = new javax.swing.JLabel();
        select10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Header.setBackground(new java.awt.Color(255, 102, 0));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 102, 0));
        jTextField1.setFont(new java.awt.Font("IrisUPC", 3, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ดำรงรวยการช่าง ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Header.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 250, 50));

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(242, 157, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("@USERNAME");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 220, 50));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/menu_icon_jing.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Header.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        MenuBar.setBackground(new java.awt.Color(69, 69, 69));
        MenuBar.setPreferredSize(new java.awt.Dimension(200, 670));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logPanel.setForeground(new java.awt.Color(69, 69, 69));

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MenuBar.add(logPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 200, 70));

        jToggleButton3.setText("sth only admin see");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        MenuBar.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(69, 69, 69));
        jButton2.setText("RECEIPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 410, 220, 70));

        HomeButton.setBackground(new java.awt.Color(255, 102, 0));
        HomeButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("HOME");
        HomeButton.setBorder(null);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        MenuBar.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, 220, 70));

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MANAGEMENT");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 220, 70));

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EQUIPMENT");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 220, 70));

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("WAREHOUSE");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 320, 220, 70));

        getContentPane().add(MenuBar, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(69, 69, 69));
        jPanel3.setForeground(new java.awt.Color(69, 69, 69));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(69, 69, 69));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("เลือกรถเพื่อทำรายการ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 1, 1));
        jPanel3.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        grid.setForeground(new java.awt.Color(51, 51, 51));
        grid.setLayout(new java.awt.GridLayout(2, 5));

        gridtop.setForeground(new java.awt.Color(51, 51, 51));

        slot1.setForeground(new java.awt.Color(51, 51, 51));

        ch1.setForeground(new java.awt.Color(51, 51, 51));
        ch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner1.setText("ชื่อ  : -");

        car_id1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id1.setText("ทะเบียนรถ  : -");

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
            .addGroup(slot1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(slot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot1Layout.createSequentialGroup()
                        .addGroup(slot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_owner1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot1Layout.createSequentialGroup()
                        .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(slot1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slot1Layout.setVerticalGroup(
            slot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ch1)
                .addGap(18, 18, 18)
                .addComponent(car_owner1)
                .addGap(18, 18, 18)
                .addComponent(car_id1)
                .addGap(22, 22, 22)
                .addComponent(select1)
                .addContainerGap())
        );

        slot2.setForeground(new java.awt.Color(51, 51, 51));

        ch2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner2.setText("ชื่อ  : -");

        car_id2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id2.setText("ทะเบียนรถ  : -");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                            .addComponent(car_owner2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                            .addComponent(ch2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))))
            .addGroup(slot2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slot2Layout.setVerticalGroup(
            slot2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(ch2)
                .addGap(18, 18, 18)
                .addComponent(car_owner2)
                .addGap(18, 18, 18)
                .addComponent(car_id2)
                .addGap(22, 22, 22)
                .addComponent(select2)
                .addContainerGap())
        );

        ch3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner3.setText("ชื่อ  : -");

        car_id3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id3.setText("ทะเบียนรถ   : -");

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
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot3Layout.createSequentialGroup()
                        .addGroup(slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_owner3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot3Layout.createSequentialGroup()
                        .addComponent(ch3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(slot3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(select3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slot3Layout.setVerticalGroup(
            slot3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(ch3)
                .addGap(18, 18, 18)
                .addComponent(car_owner3)
                .addGap(18, 18, 18)
                .addComponent(car_id3)
                .addGap(22, 22, 22)
                .addComponent(select3)
                .addContainerGap())
        );

        ch4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner4.setText("ชื่อ  : -");

        car_id4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id4.setText("ทะเบียนรถ  : -");

        select4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select4.setText("เลือก");
        select4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot4Layout = new javax.swing.GroupLayout(slot4);
        slot4.setLayout(slot4Layout);
        slot4Layout.setHorizontalGroup(
            slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot4Layout.createSequentialGroup()
                        .addGroup(slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_owner4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot4Layout.createSequentialGroup()
                        .addComponent(ch4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(slot4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(select4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slot4Layout.setVerticalGroup(
            slot4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ch4)
                .addGap(18, 18, 18)
                .addComponent(car_owner4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(car_id4)
                .addGap(22, 22, 22)
                .addComponent(select4)
                .addGap(5, 5, 5))
        );

        ch5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner5.setText("ชื่อ  : -");

        car_id5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id5.setText("ทะเบียนรถ  : -");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(slot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slot5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ch5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(car_id5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car_owner5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(slot5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(select5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot5Layout.setVerticalGroup(
            slot5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ch5)
                .addGap(18, 18, 18)
                .addComponent(car_owner5)
                .addGap(18, 18, 18)
                .addComponent(car_id5)
                .addGap(18, 18, 18)
                .addComponent(select5)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout gridtopLayout = new javax.swing.GroupLayout(gridtop);
        gridtop.setLayout(gridtopLayout);
        gridtopLayout.setHorizontalGroup(
            gridtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridtopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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

        grid.add(gridtop);

        ch6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner6.setText("ชื่อ  : -");

        car_id6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id6.setText("ทะเบียนรถ  : -");

        select6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select6.setText("เลือก");
        select6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot6Layout = new javax.swing.GroupLayout(slot6);
        slot6.setLayout(slot6Layout);
        slot6Layout.setHorizontalGroup(
            slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(car_id6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(car_owner6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot6Layout.createSequentialGroup()
                        .addComponent(ch6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(22, 22, 22))
            .addGroup(slot6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(select6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot6Layout.setVerticalGroup(
            slot6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ch6)
                .addGap(18, 18, 18)
                .addComponent(car_owner6)
                .addGap(18, 18, 18)
                .addComponent(car_id6)
                .addGap(18, 18, 18)
                .addComponent(select6)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        ch7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner7.setText("ชื่อ  : -");

        car_id7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id7.setText("ทะเบียนรถ  : -");

        select7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select7.setText("เลือก");
        select7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot7Layout = new javax.swing.GroupLayout(slot7);
        slot7.setLayout(slot7Layout);
        slot7Layout.setHorizontalGroup(
            slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                        .addGroup(slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car_id7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_owner7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot7Layout.createSequentialGroup()
                        .addComponent(ch7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(slot7Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(select7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        slot7Layout.setVerticalGroup(
            slot7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ch7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(car_owner7)
                .addGap(18, 18, 18)
                .addComponent(car_id7)
                .addGap(18, 18, 18)
                .addComponent(select7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ch8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner8.setText("ชื่อ  : -");

        car_id8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id8.setText("ทะเบียนรถ  : -");

        select8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select8.setText("เลือก");
        select8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot8Layout = new javax.swing.GroupLayout(slot8);
        slot8.setLayout(slot8Layout);
        slot8Layout.setHorizontalGroup(
            slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ch8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(car_id8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(car_owner8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(slot8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(select8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot8Layout.setVerticalGroup(
            slot8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ch8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(car_owner8)
                .addGap(18, 18, 18)
                .addComponent(car_id8)
                .addGap(18, 18, 18)
                .addComponent(select8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ch9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner9.setText("ชื่อ  : -");

        car_id9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id9.setText("ทะเบียนรถ  : -");

        select9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select9.setText("เลือก");
        select9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot9Layout = new javax.swing.GroupLayout(slot9);
        slot9.setLayout(slot9Layout);
        slot9Layout.setHorizontalGroup(
            slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ch9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(car_id9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(car_owner9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
            .addGroup(slot9Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(select9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot9Layout.setVerticalGroup(
            slot9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ch9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(car_owner9)
                .addGap(18, 18, 18)
                .addComponent(car_id9)
                .addGap(18, 18, 18)
                .addComponent(select9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ch10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/user.png"))); // NOI18N
        ch10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ch10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ch10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        car_owner10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_owner10.setText("ชื่อ  : -");

        car_id10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        car_id10.setText("ทะเบียนรถ  : -");

        select10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        select10.setText("เลือก");
        select10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        select10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slot10Layout = new javax.swing.GroupLayout(slot10);
        slot10.setLayout(slot10Layout);
        slot10Layout.setHorizontalGroup(
            slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_id10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car_owner10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(slot10Layout.createSequentialGroup()
                .addGroup(slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slot10Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ch10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(slot10Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(select10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        slot10Layout.setVerticalGroup(
            slot10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slot10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ch10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(car_owner10)
                .addGap(18, 18, 18)
                .addComponent(car_id10)
                .addGap(18, 18, 18)
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
                .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        grid.add(gridbott);

        jPanel3.add(grid, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (logPanel.isVisible()) {
            logPanel.setVisible(false);
        } else {
            logPanel.setVisible(true);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (MenuBar.isVisible()) {
            MenuBar.setVisible(false);
        } else {
            MenuBar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
        
    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select2ActionPerformed

    private void select3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select3ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select3ActionPerformed

    private void select4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select4ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select4ActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select5ActionPerformed

    private void select6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select6ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select6ActionPerformed

    private void select7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select7ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select7ActionPerformed

    private void select8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select8ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select8ActionPerformed

    private void select9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select9ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select9ActionPerformed

    private void select10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select10ActionPerformed
        ReceiptMDIApplication mdi = new ReceiptMDIApplication();
        mdi.setVisible(true);
    }//GEN-LAST:event_select10ActionPerformed

    /**
     * @param args the command line arguments
     */
    

//    if(evt.getSource()==ch1){
//            ReceiptJInternalFrame internal = new ReceiptJInternalFrame();
//            internal.setVisible(true);
//            System.out.println("Hello");
    public static void main(String args[]) {
        try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
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
    private javax.swing.JPanel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel MenuBar;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JPanel logPanel;
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
    // End of variables declaration//GEN-END:variables
}
