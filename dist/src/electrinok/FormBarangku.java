
package electrinok;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormBarangku extends javax.swing.JFrame {

     public static Connection conn;
     
     private DefaultTableModel model;
    
    
    public FormBarangku() {
        initComponents();
        
        model = new DefaultTableModel();
        
        tblMobil.setModel(model);
        
        model.addColumn("ID MOBIL");
        model.addColumn("NAMA MOBIL");

        loadData();
        
    }

    public void loadData(){
         
    // menghapus seluruh data
    model.getDataVector().removeAllElements();
    // memberi tahu bahwa data telah kosong
    
    model.fireTableDataChanged();
    try{
        
        Connection c = koneksiDatabase.getKoneksi();
        Statement s = c.createStatement();       
        String sql = "SELECT * FROM mobil";
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
            
            Object[] o = new Object[2];
            o[0] = r.getString("id_mobil");           
            o[1] = r.getString("nama_mobil");
      
            model.addRow(o);
        }
        tblMobil.setModel(model);
        r.close();
        
        s.close();
        }catch(SQLException e){
            System.out.println("Terjadi Error pada Insert Table");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtidMobil = new javax.swing.JTextField();
        txtNamaMobil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("ID _ MOBIL :");

        jLabel2.setText("NAMA_MOBIL :");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id_mobil", "nama_mobil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMobilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMobil);

        btnCetak.setText("Reset");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jLabel3.setText("FORM BARANG");

        jButton4.setText("Kembali");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaMobil)
                            .addComponent(txtidMobil)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCetak)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(btnCetak)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conn = koneksiDatabase.getKoneksi();
        
        // Panggil
        int id_mobil = Integer.parseInt(txtidMobil.getText());
        String nama_mobil = txtNamaMobil.getText();
        
        String query = "INSERT INTO mobil(id_mobil , nama_mobil) " + "VALUES('"+id_mobil+"',  '"+nama_mobil+"')";

        try{
               Statement stm = conn.createStatement();
               stm.execute(query);
               
               this.loadData();
               System.out.println("Data Telah Masuk Ke Database");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
      
        int i = tblMobil.getSelectedRow();
        
        if(i == -1){
        // tidak ada baris terseleksi
        return;
        }
        
        String id_mobil = (String) model.getValueAt(i, 0);
        try{
            Connection c = koneksiDatabase.getKoneksi();
            String sql = "DELETE FROM mobil WHERE id_mobil = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, id_mobil);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.err.println("Terjadi Error");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        conn = koneksiDatabase.getKoneksi();
        
        int i = tblMobil.getSelectedRow();
        if(i == -1){
        // tidak ada baris terseleksi
        return;
        }
        
        // ambil nim yang terseleksi
        String id_mobil = txtidMobil.getText();
        String nama_mobil = txtNamaMobil.getText();
   
        try{
            Connection c = koneksiDatabase.getKoneksi();
            String sql = "UPDATE mobil SET nama_mobil = '"+nama_mobil+"' WHERE id_mobil = '"+id_mobil+"'";
             PreparedStatement p = c.prepareStatement(sql);
              p.executeUpdate();
              p.close();
            
            
        }catch(SQLException e){
            System.out.println("Terjadi Error pada Update ");
        }finally{
            this.loadData();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
                
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x =(posisi.width-this.getWidth())/2;
        int y =(posisi.height-this.getHeight())/2;
        
        this.setLocation(x, y);
        
    }//GEN-LAST:event_formWindowActivated

    private void tblMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMobilMouseClicked
        // TODO add your handling code here:
        
         int baris = tblMobil.getSelectedRow();
         
        String kolom1 = tblMobil.getValueAt(baris, 0).toString();
        String kolom2 = tblMobil.getValueAt(baris, 1).toString();

        
        txtidMobil.setText(kolom1);
        txtNamaMobil.setText(kolom2);
   
        
    }//GEN-LAST:event_tblMobilMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
     public void Bersih(){
        txtidMobil.setText("");
        txtNamaMobil.setText("");
        txtidMobil.requestFocus();
    }
    
    
    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try{
            Bersih();
            loadData();
            txtidMobil.requestFocus();
        }catch(Exception e){
            
            
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarangku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTextField txtNamaMobil;
    private javax.swing.JTextField txtidMobil;
    // End of variables declaration//GEN-END:variables
}
