
package electrinok;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public final class FormTransaksiku extends javax.swing.JFrame {
    
    JasperReport jasperReport;
    JasperDesign jasperDesign;
    JasperPrint jasperPrint;
    Map<String, Object> param = new HashMap<String, Object>();
    
    public static Connection conn;
    
    
    private DefaultTableModel model;
    
    public FormTransaksiku() {
        initComponents();
        this.loadData();
        this.setListcontrolBarang();
        
        model = new DefaultTableModel();
        
        tblTransaksi.setModel(model);
        
        model.addColumn("KODE TRANSAKSI");
        model.addColumn("TANGGAL");
        model.addColumn("NAMA BARANG");
  
        loadData();
    }
    
  public void IsiComboNamaMobil(){
      
     
       try{
            cmbBarang.removeAllItems();
            //txtHarga1.removeAllItems();
            conn = koneksiDatabase.getKoneksi();
            
            String query = "select * from transaksi";
            Connection c = koneksiDatabase.getKoneksi();
            Statement s = c.createStatement();
            ResultSet res = s.executeQuery(query);
            cmbBarang.addItem("Pilih Mobil");
           
            while(res.next()){
                cmbBarang.addItem(res.getString("nama_mobil"));
              
            }
       }catch(Exception e){

       }
    }
    
  public void loadData(){
    
        try{
            conn = koneksiDatabase.getKoneksi();
            String query = "SELECT * FROM transaksi";
            Statement stm = conn.prepareStatement(query);
            
            ResultSet res = stm.executeQuery(query);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("no_transaksi");
            model.addColumn("tanggal");
            model.addColumn("nama_mobil");

            
            
            int i = 0;
            
            while(res.next()){
                i = i + 1;
                model.addRow(new Object[]
                    {
                       
                        res.getInt("no_transaksi"),
                        res.getString("tanggal"),
                        res.getString("nama_mobil")
                     
                    }    
                );
            }
            
            tblTransaksi.setModel(model);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
    }
  
  
public void setListcontrolBarang(){
    
    //controlBarang barangBarang = new  controlBarang();
    
      List<controlBarang> prodiku = controlBarang.getListcontrolBarang();
      cmbBarang.removeAllItems();
        for(controlBarang barangKu : prodiku){
            cmbBarang.addItem(barangKu.toString());
            
            
            
        }
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnoTransaksi = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        cmbBarang = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("FORM TRANSAKSI");

        jLabel2.setText("KODE TRANSAKSI :");

        jLabel3.setText("NAMA BARANG :");

        jLabel4.setText("TANGGAL TRANSAKSI :");

        cmbBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEdit.setBackground(new java.awt.Color(0, 0, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(51, 255, 0));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCetak.setBackground(new java.awt.Color(153, 0, 153));
        btnCetak.setForeground(new java.awt.Color(255, 255, 255));
        btnCetak.setText("CETAK");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("DELETE");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        jButton1.setBackground(new java.awt.Color(102, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("KEMBALI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnoTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                .addComponent(tanggal))
                            .addComponent(cmbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(2, 2, 2)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtnoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnCetak)
                    .addComponent(btnHapus)
                    .addComponent(btnSimpan)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
          if(txtnoTransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Masukkan Data Edit");
        } else{
                    
                    conn = koneksiDatabase.getKoneksi();
                    
                    
                    int i = tblTransaksi.getSelectedRow();
                    if(i == -1){
                    // tidak ada baris terseleksi
                    return;
                    }
                    // ambil nim yang terseleksi
                    String noTransaksi = txtnoTransaksi.getText();
                    String tanggalBarang = tanggal.getText(); 
                    String nama_barang = cmbBarang.getSelectedItem().toString();
                    //String hargaBarang = txtHarga.getText();
                    //isiTable();
                    //transaksi.no_transaksi = txtNomerTransaksi.getText();
                    
               
                   try{
                            Connection c = koneksiDatabase.getKoneksi();

                            String sql = "update transaksi set tanggal= '"+tanggalBarang+"' , nama_mobil= '"+nama_barang+"' where no_transaksi= '"+noTransaksi+"'  ";
                            PreparedStatement p = c.prepareStatement(sql);
                             p.executeUpdate();
                                      p.close();
                        }catch(Exception e){
                            System.out.println("Terjadi Error pada");
                        }finally{
                        loadData();
                      }

          }
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
        conn = koneksiDatabase.getKoneksi();
        
        int i = tblTransaksi.getSelectedRow();
        if(i == -1){
        // tidak ada baris terseleksi
        return;
        }
        String noTransaksi = txtnoTransaksi.getText();;
        try{
        Connection c = koneksiDatabase.getKoneksi();
        String sql = "DELETE FROM transaksi WHERE   no_transaksi= '"+noTransaksi+"'";
        PreparedStatement p = c.prepareStatement(sql);
        
        p.executeUpdate();
        p.close();
        
        }catch(SQLException e){
        System.err.println("Terjadi Error pada Hapus");
        }finally{
        loadData();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
          
        conn = koneksiDatabase.getKoneksi();
            
          try {
            File file = new File("src\\electrinok\\Report.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param,koneksiDatabase.getKoneksi());
            
            JasperViewer.viewReport(jasperPrint, false);
            } catch (Exception e) {
            e.printStackTrace();
            
            }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        
        int baris = tblTransaksi.getSelectedRow();
         
        String kolom1 = tblTransaksi.getValueAt(baris, 0).toString();
        String kolom2 = tblTransaksi.getValueAt(baris, 1).toString();
        String kolom3 = tblTransaksi.getValueAt(baris, 2).toString();
        //String kolom4 = tblTransaksi.getValueAt(baris, 3).toString();
        
        txtnoTransaksi.setText(kolom1);
        tanggal.setText(kolom2);
        cmbBarang.removeAllItems();
        cmbBarang.addItem(kolom3);
        //txtHarga.setText(kolom4);
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
         conn = koneksiDatabase.getKoneksi();    
        
        
              String noTransaksi = txtnoTransaksi.getText();
              String tanggalBarang = tanggal.getText(); 
              String nama_barang = cmbBarang.getSelectedItem().toString();
             // String hargaBarang = txtHarga.getText();
            try{
                Connection c = koneksiDatabase.getKoneksi();
                String sql = "INSERT INTO transaksi VALUES ('"+noTransaksi+"', '"+tanggalBarang+"' , '"+nama_barang+"' )";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate();
                p.close();
                
            }catch(SQLException e){ System.out.println("Terjadi Error");
            
            }finally{
                loadData();
            }
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    
    public void Bersih(){
        txtnoTransaksi.setText("");
        tanggal.setText("");
        IsiComboNamaMobil();
        //txtHarga.setText("");
        txtnoTransaksi.requestFocus();
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Bersih();
            loadData();
            txtnoTransaksi.requestFocus();
        }catch(Exception e){
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x =(posisi.width-this.getWidth())/2;
        int y =(posisi.height-this.getHeight())/2;
        
        this.setLocation(x, y);
        
    }//GEN-LAST:event_formWindowActivated
    
  
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
            java.util.logging.Logger.getLogger(FormTransaksiku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksiku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtnoTransaksi;
    // End of variables declaration//GEN-END:variables
}
