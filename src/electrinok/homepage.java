
package electrinok;

import java.awt.Dimension;
import java.awt.Toolkit;


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
        jMenu2 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenu();
        jKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang");

        jAdmin.setText("Admin");
        jAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jAdmin);

        jMobil.setText("Barang");
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
        jMenuBar1.add(jMenu2);

        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAbout);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
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

    private void jKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKeluarMouseClicked
        // TODO add your handling code here:
        formLogin login = new formLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jKeluarMouseClicked

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        // TODO add your handling code here:
        
        MenuAbout AboutCuy = new MenuAbout();
        AboutCuy.setVisible(true);
        
    }//GEN-LAST:event_menuAboutMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x =(posisi.width-this.getWidth())/2;
        int y =(posisi.height-this.getHeight())/2;
        
        this.setLocation(x, y);
    }//GEN-LAST:event_formWindowActivated

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMobil;
    private javax.swing.JMenu jTransaksi;
    private javax.swing.JMenu menuAbout;
    // End of variables declaration//GEN-END:variables
}
