/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import koneksi.Connect;
import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.cj.jdbc.Driver;
import java.awt.Frame;
/**
 *
 * @author perlengkapan
 */
public class ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPassword
     */
    public ForgetPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_username = new javax.swing.JTextField();
        txt_pin = new javax.swing.JTextField();
        txt_newPass = new javax.swing.JPasswordField();
        checkPass = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_forget = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(null);

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        txt_username.setBorder(null);
        getContentPane().add(txt_username);
        txt_username.setBounds(680, 254, 310, 26);

        txt_pin.setBackground(new java.awt.Color(255, 255, 255));
        txt_pin.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        txt_pin.setBorder(null);
        txt_pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pinActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pin);
        txt_pin.setBounds(680, 340, 310, 30);

        txt_newPass.setBackground(new java.awt.Color(255, 255, 255));
        txt_newPass.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        txt_newPass.setBorder(null);
        getContentPane().add(txt_newPass);
        txt_newPass.setBounds(680, 430, 310, 30);

        checkPass.setBackground(new java.awt.Color(255, 255, 255));
        checkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkPass);
        checkPass.setBounds(670, 470, 20, 19);

        jLabel2.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Show Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 470, 100, 18);

        jLabel1.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        jLabel1.setText("Sudah punya akun ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 640, 130, 18);

        jLabel3.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 133, 255));
        jLabel3.setText("Login");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(850, 640, 37, 16);

        btn_forget.setBackground(new java.awt.Color(252, 191, 73));
        btn_forget.setFont(new java.awt.Font("Outfit", 0, 21)); // NOI18N
        btn_forget.setForeground(new java.awt.Color(0, 0, 0));
        btn_forget.setText("Ubah Password");
        btn_forget.setBorder(null);
        btn_forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forgetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_forget);
        btn_forget.setBounds(660, 530, 350, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(660, 520, 350, 70);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1160, 0, 30, 30);

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Outfit Black", 0, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(0, 0, 0));
        minimize.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(minimize)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1130, 0, 30, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forgetPassword.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1200, 675);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassActionPerformed
        // TODO add your handling code here:
        if(checkPass.isSelected()){
            txt_newPass.setEchoChar((char)0);
        }else{
            txt_newPass.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPassActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txt_pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pinActionPerformed

    private void btn_forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forgetActionPerformed
        // TODO add your handling code here:
        try{
            if(txt_username.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
                txt_username.requestFocus();
            }else if(txt_pin.getText().equals("")){
                JOptionPane.showMessageDialog(null, "PIN tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
                txt_newPass.requestFocus();
            }else if(txt_newPass.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Password tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
                txt_newPass.requestFocus();
            }else{
                java.sql.Connection conn = (Connection)Connect.GetConnection();
                String sql = "SELECT * FROM pengguna WHERE username = '"+ txt_username.getText() +"' AND pin = '"+ txt_pin.getText() +"'";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery(sql);
                rs.next();
                PreparedStatement ps = conn.prepareStatement("update pengguna set password='"+ txt_newPass.getText() +"' where id_pengguna='"+ rs.getString("id_pengguna") +"'");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diperbarui, silahkan login");
                this.setVisible(false);
                new Login().setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Username atau PIN Salah");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_forgetActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        int confirmExit = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin keluar ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(confirmExit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_forget;
    private javax.swing.JCheckBox checkPass;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField txt_newPass;
    private javax.swing.JTextField txt_pin;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
