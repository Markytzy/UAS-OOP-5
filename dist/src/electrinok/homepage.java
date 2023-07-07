
package electrinok;


public class homepage extends javax.swing.JFrame {


    public homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAdmin = new javax.swing.JMenu();
        jMobil = new javax.swing.JMenu();
        jTransaksi = new javax.swing.JMenu();
        jLaporan = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("Halaman Dashboard");

        jAdmin.setText("Admin");
        jAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jAdmin);

        jMobil.setText("Master");
        jMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMobilMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMobil);

        jTransaksi.setText("Transaksi");
        jTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTransaksiMouseClicked(evt);
            }
        });
        jMenuBar1.add(jTransaksi);

        jLaporan.setText("Laporan");
        jLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLaporanMouseClicked(evt);
            }
        });
        jLaporan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLaporanComponentMoved(evt);
            }
        });
        jMenuBar1.add(jLaporan);

        jMenu2.setText("Repost");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("About");
        jMenuBar1.add(jMenu1);

        jKeluar.setText("Keluar");
        jKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jKeluarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdminMouseClicked


//        FormAdmin admin = new FormAdmin();
//        admin.setVisible(true);
    }//GEN-LAST:event_jAdminMouseClicked

    private void jMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMobilMouseClicked
        // TODO add your handling code here:

        FormBarangku mobil = new FormBarangku();
        mobil.setVisible(true);

    }//GEN-LAST:event_jMobilMouseClicked

    private void jTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTransaksiMouseClicked
        // TODO add your handling code here:

        FormTransaksiku transaksi = new FormTransaksiku();
        transaksi.setVisible(true);

    }//GEN-LAST:event_jTransaksiMouseClicked

    private void jLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLaporanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaporanMouseClicked

    private void jLaporanComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLaporanComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLaporanComponentMoved

    private void jKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKeluarMouseClicked
        // TODO add your handling code here:
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jKeluarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAdmin;
    private javax.swing.JMenu jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jLaporan;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMobil;
    private javax.swing.JMenu jTransaksi;
    // End of variables declaration//GEN-END:variables
}
