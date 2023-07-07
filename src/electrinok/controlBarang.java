/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrinok;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class controlBarang {

    // Konstraktor
    private int id_mobil;
    private String nama_mobil;
    private String harga;
    
    public controlBarang(int newId, String newNama,  String newHarga){
        this.id_mobil = newId;
        this.nama_mobil = newNama;
        this.harga = newHarga;

    }

   
        // Get Id
        public int getId(){
            return this.id_mobil;
        }
        
         public String getNama(){
            return this.nama_mobil;
        }
         
           public String getHarga(){
            return this.harga;
        }
     
    // untuk menaruh nama diComboBox

        @Override
         public String toString(){
             return this.nama_mobil;
         }
         
      
     
     public static List<controlBarang> getListcontrolBarang(){
         
         List Barang = new ArrayList();

         try{
            // Ambil data kedatabase
         Connection conn = koneksiDatabase.getKoneksi();
         Statement stm = conn.createStatement();  
         
         String query = "SELECT * FROM mobil"; 
         stm.executeQuery(query);
         
         ResultSet res = stm.executeQuery(query);
         
            while(res.next()){
                // prds Variabel baru
                controlBarang barangKu = new controlBarang( 
                                            res.getInt("id_mobil"),
                                           res.getString("nama_mobil"),
                                           res.getString("harga")
                                          );
                Barang.add(barangKu);
            }
         
         } catch(Exception e){
             
         }
         
         
         return Barang;
     }
     
     
}

    
    

