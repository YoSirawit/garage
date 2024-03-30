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

        GrayBG = new javax.swing.JPanel();
        UsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrayBG.setBackground(new java.awt.Color(255, 255, 255));

        UsernameField.setBackground(new java.awt.Color(204, 204, 204));
        UsernameField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        UsernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        UsernameField.setToolTipText("Enter Username");
        UsernameField.setBorder(null);

        PasswordLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        PasswordLabel.setText("Password");

        UsernameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        UsernameLabel.setText("Username");

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

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jPasswordField1.setToolTipText("Enter Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setMinimumSize(new java.awt.Dimension(64, 25));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/5.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/PasswordIcon.png"))); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jTextField1.setText("เข้าสู่ระบบ");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout GrayBGLayout = new javax.swing.GroupLayout(GrayBG);
        GrayBG.setLayout(GrayBGLayout);
        GrayBGLayout.setHorizontalGroup(
            GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrayBGLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PasswordLabel)
                        .addComponent(UsernameLabel)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(GrayBGLayout.createSequentialGroup()
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GrayBGLayout.setVerticalGroup(
            GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrayBGLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(UsernameLabel)
                .addGap(6, 6, 6)
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GrayBGLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)))
                .addGap(12, 12, 12)
                .addComponent(PasswordLabel)
                .addGroup(GrayBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GrayBGLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(GrayBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 490, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TestIcon/blur.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel GrayBG;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
