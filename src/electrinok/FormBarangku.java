
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
        
        model.addColumn("ID BARANG");
        model.addColumn("NAMA BARANG");
        model.addColumn("HARGA BARANG");
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
            
            Object[] o = new Object[3];
            o[0] = r.getString("id_mobil");           
            o[1] = r.getString("nama_mobil");
            o[2] = r.getString("harga");
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
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMobil = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();

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

        jLabel1.setText("ID _ BARANG :");

        jLabel2.setText("NAMA_BARANG :");

        btnSimpan.setBackground(new java.awt.Color(0, 255, 51));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 51, 255));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 51));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_mobil", "nama_mobil", "harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        btnReset.setBackground(new java.awt.Color(255, 255, 51));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("FORM BARANG");

        btnKembali.setBackground(new java.awt.Color(204, 0, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel4.setText("HARGA BARANG :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKembali))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(txtHarga)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(btnSimpan)
                    .addComponent(btnReset)
                    .addComponent(btnKembali))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        conn = koneksiDatabase.getKoneksi();
        
        // Panggil
        int id_mobil = Integer.parseInt(txtidMobil.getText());
        String nama_mobil = txtNamaMobil.getText();
        String hargaMobil = txtHarga.getText();
        
        String query = "INSERT INTO mobil(id_mobil , nama_mobil , harga) " + "VALUES('"+id_mobil+"',  '"+nama_mobil+"' ,  '"+hargaMobil+"'    )";

        try{
               Statement stm = conn.createStatement();
               stm.execute(query);
               
               this.loadData();
               System.out.println("Data Telah Masuk Ke Database");
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
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
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
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
        String hargaMobil = txtHarga.getText();
        
        try{
            Connection c = koneksiDatabase.getKoneksi();
            String sql = "UPDATE mobil SET nama_mobil = '"+nama_mobil+"' , harga = '"+hargaMobil+"' WHERE id_mobil = '"+id_mobil+"'";
             PreparedStatement p = c.prepareStatement(sql);
              p.executeUpdate();
              p.close();
            
            
        }catch(SQLException e){
            System.out.println("Terjadi Error pada Update ");
        }finally{
            this.loadData();
        }
        
        
    }//GEN-LAST:event_btnEditActionPerformed

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
        String kolom3 = tblMobil.getValueAt(baris, 2).toString();
        
        txtidMobil.setText(kolom1);
        txtNamaMobil.setText(kolom2);
        txtHarga.setText(kolom3);
   
        
    }//GEN-LAST:event_tblMobilMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    
     public void Bersih(){
        txtidMobil.setText("");
        txtNamaMobil.setText("");
        txtHarga.setText("");
        txtidMobil.requestFocus();
    }
    
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try{
            Bersih();
            loadData();
            txtidMobil.requestFocus();
        }catch(Exception e){
            
            
        }
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarangku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMobil;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNamaMobil;
    private javax.swing.JTextField txtidMobil;
    // End of variables declaration//GEN-END:variables
}
