
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
        public static int pesanan_berlangsung;

    public void Pesanan_Berlangsung() {
        try {
            String sql = "SELECT COUNT(Status) AS psn_brlngsg FROM data_sewaan WHERE Status = 'Proses'";
            java.sql.Connection conn = (Connection) koneksi.Connect.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                pesanan_berlangsung = rs.getInt("psn_brlngsg");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String result = String.valueOf(pesanan_berlangsung);
        txt_pesanan_lngsng.setText(result);
    }
    
    public static int ttl_pesanan;

    public void Total_Pesanan() {
        try {
            String sql = "SELECT COUNT(id_sewaan) AS jml_pesanan FROM data_sewaan";
            java.sql.Connection conn = (Connection) koneksi.Connect.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                ttl_pesanan = rs.getInt("jml_pesanan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String result = String.valueOf(ttl_pesanan);
        txt_ttl_pesanan.setText(result);
    }
    
        public static int pesanan_selesai;

    public void Pesanan_Selesai() {
        try {
            String sql = "SELECT COUNT(id_pengembalian) AS jml_pengembalian FROM data_pengembalian";
            java.sql.Connection conn = (Connection) koneksi.Connect.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                pesanan_selesai = rs.getInt("jml_pengembalian");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String result = String.valueOf(pesanan_selesai);
        txt_pesanan_selesai.setText(result);
    }
    
        public static int total;

    public void Total_Transaksi() {
        try {
            String sql = "SELECT SUM(total) AS jml FROM data_sewaan";
            java.sql.Connection conn = (Connection) koneksi.Connect.GetConnection();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                total = rs.getInt("jml");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String result = String.valueOf(total);
        total_transaksi.setText("Rp" + result);
    }
    
        public void tanggal() {
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        txttgl.setText(s.format(ys));
    }

    public void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss");
                String tim = s.format(d);
                txtwaktu.setText(tim);
            }
        }).start();
    }
    
    public Dashboard() {
        initComponents();
        tanggal();
        Total_Transaksi();
        Total_Pesanan();
        Pesanan_Selesai();
        Pesanan_Berlangsung();
        showTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        MenuName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_beranda = new javax.swing.JButton();
        btn_kasir = new javax.swing.JButton();
        btn_dataBarang = new javax.swing.JButton();
        btn_sewa = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        btn_pengguna = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_pesanan_lngsng = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_pesanan_selesai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total_transaksi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ttl_pesanan = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txttgl = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtwaktu = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Outfit", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Logout");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        MenuName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MenuName.setText("Dashboard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(MenuName)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MenuName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Home / Dashboard");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jPanel9.setBackground(new java.awt.Color(252, 191, 73));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Awan Adventure");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jPanel8.setBackground(new java.awt.Color(248, 221, 113));

        btn_beranda.setBackground(new java.awt.Color(248, 221, 113));
        btn_beranda.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_beranda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btn_beranda.setText("Beranda");
        btn_beranda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_beranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_beranda.setIconTextGap(12);

        btn_kasir.setBackground(new java.awt.Color(248, 221, 113));
        btn_kasir.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_kasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trolley-removebg-preview.png"))); // NOI18N
        btn_kasir.setText("Form Kasir");
        btn_kasir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_kasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kasir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_kasir.setIconTextGap(12);
        btn_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kasirMouseClicked(evt);
            }
        });

        btn_dataBarang.setBackground(new java.awt.Color(248, 221, 113));
        btn_dataBarang.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_dataBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/package.png"))); // NOI18N
        btn_dataBarang.setText("Data Barang");
        btn_dataBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_dataBarang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_dataBarang.setIconTextGap(12);
        btn_dataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataBarangActionPerformed(evt);
            }
        });

        btn_sewa.setBackground(new java.awt.Color(248, 221, 113));
        btn_sewa.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_sewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rent-removebg-preview.png"))); // NOI18N
        btn_sewa.setText("Data Sewaan");
        btn_sewa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_sewa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_sewa.setIconTextGap(12);

        btn_return.setBackground(new java.awt.Color(248, 221, 113));
        btn_return.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product-return-removebg-preview.png"))); // NOI18N
        btn_return.setText("Form Pengembalian");
        btn_return.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_return.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_return.setIconTextGap(12);

        btn_pengguna.setBackground(new java.awt.Color(248, 221, 113));
        btn_pengguna.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_pengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-removebg-preview.png"))); // NOI18N
        btn_pengguna.setText("Pengguna");
        btn_pengguna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pengguna.setIconTextGap(12);
        btn_pengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_penggunaActionPerformed(evt);
            }
        });

        btn_report.setBackground(new java.awt.Color(248, 221, 113));
        btn_report.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-removebg-preview.png"))); // NOI18N
        btn_report.setText("Laporan");
        btn_report.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(248, 221, 113)));
        btn_report.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_report.setIconTextGap(12);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_kasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_dataBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_sewa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_return, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
            .addComponent(btn_pengguna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pengguna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 560));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Pesanan Berlangsung");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        txt_pesanan_lngsng.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_pesanan_lngsng.setText("-");
        getContentPane().add(txt_pesanan_lngsng, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pesanan Selesai");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        txt_pesanan_selesai.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_pesanan_selesai.setText("-");
        getContentPane().add(txt_pesanan_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Transaksi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        total_transaksi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        total_transaksi.setText("-");
        getContentPane().add(total_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total Pesanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, -1, -1));

        txt_ttl_pesanan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt_ttl_pesanan.setText("-");
        getContentPane().add(txt_ttl_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_pay_date_30px.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, 30, 30));

        txttgl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttgl.setText("tanggal");
        getContentPane().add(txttgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 640, -1, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_time_30px.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, 30, 30));

        txtwaktu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtwaktu.setText("waktu");
        getContentPane().add(txtwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 640, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int confirmLogout = JOptionPane.showConfirmDialog(rootPane, "Yakin ingin logout ?", "Logout", JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kasirMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FormKasir().setVisible(true);
    }//GEN-LAST:event_btn_kasirMouseClicked

    private void btn_penggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_penggunaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Pengguna().setVisible(true);
    }//GEN-LAST:event_btn_penggunaActionPerformed

    private void btn_dataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataBarangActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DataBarang().setVisible(true);
    }//GEN-LAST:event_btn_dataBarangActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MenuName;
    private javax.swing.JButton btn_beranda;
    private javax.swing.JButton btn_dataBarang;
    private javax.swing.JButton btn_kasir;
    private javax.swing.JButton btn_pengguna;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_sewa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel total_transaksi;
    private javax.swing.JLabel txt_pesanan_lngsng;
    private javax.swing.JLabel txt_pesanan_selesai;
    private javax.swing.JLabel txt_ttl_pesanan;
    private javax.swing.JLabel txttgl;
    private javax.swing.JLabel txtwaktu;
    // End of variables declaration//GEN-END:variables
}
