import java.awt.*;
import java.awt.event.*;
public class CreateAccFrame extends javax.swing.JFrame{
    public TestConnection db;
    
    public CreateAccFrame() {
        initComponents();
        db = new TestConnection();
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrangeBG = new javax.swing.JPanel();
        WhiteBG = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        CreateLabel = new javax.swing.JLabel();
        CreateTHLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        SurnameField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        SurnameLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        CreateAccButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OrangeBG.setBackground(new java.awt.Color(242, 157, 0));

        BackButton.setBackground(new java.awt.Color(204, 204, 204));
        BackButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        BackButton.setText("Go Back");
        BackButton.setToolTipText("Go back to Login Frame");
        BackButton.setBorder(null);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CreateLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        CreateLabel.setText("Create Account");

        CreateTHLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreateTHLabel.setForeground(new java.awt.Color(181, 181, 181));
        CreateTHLabel.setText("สมัครบัญชีใหม่");

        EmailField.setBackground(new java.awt.Color(221, 221, 221));
        EmailField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        EmailField.setToolTipText("Enter Email");
        EmailField.setBorder(null);

        PasswordField.setBackground(new java.awt.Color(221, 221, 221));
        PasswordField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PasswordField.setToolTipText("Enter New Password");
        PasswordField.setBorder(null);

        SurnameField.setBackground(new java.awt.Color(221, 221, 221));
        SurnameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SurnameField.setToolTipText("Enter New Surname");
        SurnameField.setBorder(null);

        NameField.setBackground(new java.awt.Color(221, 221, 221));
        NameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        NameField.setToolTipText("Enter New Name");
        NameField.setBorder(null);

        SurnameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        SurnameLabel.setText("Surname");

        UsernameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        UsernameLabel.setText("Username");

        NameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        PasswordLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameField.setBackground(new java.awt.Color(221, 221, 221));
        UsernameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        UsernameField.setToolTipText("Enter New Username");
        UsernameField.setBorder(null);

        PhoneNumber.setBackground(new java.awt.Color(221, 221, 221));
        PhoneNumber.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PhoneNumber.setToolTipText("Enter Phone Number");
        PhoneNumber.setBorder(null);

        EmailLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        EmailLabel.setText("Email");

        PhoneLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        PhoneLabel.setText("Phone Number");

        CreateAccButton.setBackground(new java.awt.Color(255, 187, 125));
        CreateAccButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        CreateAccButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateAccButton.setText("Create");
        CreateAccButton.setToolTipText("Create Account");
        CreateAccButton.setBorder(null);
        CreateAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WhiteBGLayout = new javax.swing.GroupLayout(WhiteBG);
        WhiteBG.setLayout(WhiteBGLayout);
        WhiteBGLayout.setHorizontalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteBGLayout.createSequentialGroup()
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(CreateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CreateTHLabel))
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(WhiteBGLayout.createSequentialGroup()
                                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UsernameField))
                                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SurnameField)
                                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)))
                                    .addComponent(PhoneLabel))))))
                .addContainerGap(330, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WhiteBGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CreateAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        WhiteBGLayout.setVerticalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateLabel)
                    .addComponent(CreateTHLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameLabel)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PhoneLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(CreateAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout OrangeBGLayout = new javax.swing.GroupLayout(OrangeBG);
        OrangeBG.setLayout(OrangeBGLayout);
        OrangeBGLayout.setHorizontalGroup(
            OrangeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhiteBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        OrangeBGLayout.setVerticalGroup(
            OrangeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangeBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WhiteBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrangeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OrangeBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        close();
        LoginFrame Login = new LoginFrame();
        Login.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CreateAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccButtonActionPerformed
        if(evt.getSource() == CreateAccButton){
            String name = NameField.getText();
            String surname = SurnameField.getText();
            String username = UsernameField.getText();
            String password = PasswordField.getText();
            String email = EmailField.getText();
            String phone = PhoneNumber.getText();
            int user_level = 1;
            String sql = String.format("INSERT INTO userid (FirstName, LastName, username, user_pass, email, phone, user_level) VALUES('%s','%s','%s','%s','%s','%s',%d);",name,surname,username,password,email,phone,user_level);
            db.getUpdate(sql);

       }
    }//GEN-LAST:event_CreateAccButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateAccFrame Sign = new CreateAccFrame();
                Sign.setSize(1280,720);
                Sign.setResizable(false);
                new CreateAccFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CreateAccButton;
    private javax.swing.JLabel CreateLabel;
    private javax.swing.JLabel CreateTHLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel OrangeBG;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel WhiteBG;
    // End of variables declaration//GEN-END:variables
}
