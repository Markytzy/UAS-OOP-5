/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrinok;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksiDatabase {
    private static Connection koneksi;      
    public static Connection getKoneksi() { 
        
        try {
        String url = "jdbc:mysql://localhost:3306/penjualan_mobil";
        String user = "root";
        String password = "";
       
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
        koneksi = DriverManager.getConnection(url, user, password);
        } catch (SQLException t) { 
            System.out.println("Error Membuat Koneksi");
        }
        return koneksi; 
    }
    int no_transaksi;
    
    
    
    
}



