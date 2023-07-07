
package electrinok;

import javax.swing.JOptionPane;

public class controlLogin  extends koneksiDatabase{
    String mUsername;
    String mPassword;
    
    
    
    public void masuk(){
        try{
            String sql = " select * from admin where username = '"+mUsername+"' and password = '"+mPassword+"' "; 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    
      public void keluar(){
        try{
           JOptionPane.showMessageDialog(null, "Berhasil keluar");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
      
      
      public void daftar(){
        try{
           JOptionPane.showMessageDialog(null, "Silahkan Sign Up");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
      }
}
