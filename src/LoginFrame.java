import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
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
        LoginLabel = new javax.swing.JLabel();
        GrayBG = new javax.swing.JPanel();
        UsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        CreateAcc = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrangeBG.setBackground(new java.awt.Color(242, 157, 0));

        WhiteBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LoginLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 72)); // NOI18N
        LoginLabel.setText("Login");

        GrayBG.setBackground(new java.awt.Color(218, 218, 218));

        UsernameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        UsernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        UsernameField.setToolTipText("Enter Username");
        UsernameField.setBorder(null);

        PasswordLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        UsernameLabel.setText("Username");

        CreateAcc.setBackground(new java.awt.Color(252, 252, 252));
        CreateAcc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        CreateAcc.setForeground(new java.awt.Color(146, 146, 146));
        CreateAcc.setText("Create New Account");
        CreateAcc.setToolTipText("Create New Account");
        CreateAcc.setBorder(null);
        CreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(186, 186, 186));
        LoginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setToolTipText("Login to _______");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jPasswordField1.setToolTipText("Enter Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setMinimumSize(new java.awt.Dimension(64, 25));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(64, 29));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GrayBGLayout = new javax.swing.GroupLayout(GrayBG);
        GrayBG.setLayout(GrayBGLayout);
        GrayBGLayout.setHorizontalGroup(
            GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrayBGLayout.createSequentialGroup()
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsernameLabel)
                            .addComponent(UsernameField)
                            .addComponent(PasswordLabel)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrayBGLayout.createSequentialGroup()
                .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        GrayBGLayout.setVerticalGroup(
            GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrayBGLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WhiteBGLayout = new javax.swing.GroupLayout(WhiteBG);
        WhiteBG.setLayout(WhiteBGLayout);
        WhiteBGLayout.setHorizontalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteBGLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(LoginLabel)
                .addGap(132, 132, 132)
                .addComponent(GrayBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        WhiteBGLayout.setVerticalGroup(
            WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WhiteBGLayout.createSequentialGroup()
                .addGroup(WhiteBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(GrayBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WhiteBGLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(LoginLabel)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OrangeBGLayout = new javax.swing.GroupLayout(OrangeBG);
        OrangeBG.setLayout(OrangeBGLayout);
        OrangeBGLayout.setHorizontalGroup(
            OrangeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangeBGLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(WhiteBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        OrangeBGLayout.setVerticalGroup(
            OrangeBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrangeBGLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(WhiteBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(OrangeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccActionPerformed
        // TODO add your handling code here:
        CreateAccFrame Sign = new CreateAccFrame();
        Sign.setVisible(true);
        close();
    }//GEN-LAST:event_CreateAccActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFrame Login = new LoginFrame();
                Login.setSize(1280, 720);
                Login.setResizable(false);
                new LoginFrame().setVisible(true);
            }
        });
    }
    
    public String getUsername(){
        return this.UsernameField.getText();
    }
    public String getPassword(){
        char[] tmp = jPasswordField1.getPassword();
        String pass = "";
        for(int i=0; i<tmp.length; i++){
            pass += tmp[i]+"";
        }
        return pass;
    }
    public JButton getLoginButton(){
        return this.LoginButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAcc;
    private javax.swing.JPanel GrayBG;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel OrangeBG;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel WhiteBG;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
