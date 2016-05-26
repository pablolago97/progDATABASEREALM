
package databaseprog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Metodos {
    
    
     
    public void input(int idpreso, String apellido, String nombre, String nacionalidad, String delito){
      String SQL = "INSERT INTO Info(idpreso, apellido, nombre, nacionalidad, delito) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = Conexion_database.co.prepareStatement(SQL);
            pst.setInt(1, idpreso);
            pst.setString(2,apellido);
            pst.setString(3,nombre);
            pst.setString(4,nacionalidad);
            pst.setString(5,delito);
            int n = pst.executeUpdate();
            if (n>0){
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Id repetida o fallo de conexión");
        }
}
     public ResultSet consult() {
        ResultSet rs=null;
       
        try {
            Statement s = Conexion_database.co.createStatement();
           rs = s.executeQuery("select * from Info;");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return rs;
    }
     
     public  void delete(String x) throws SQLException{
      
       
       String SQL = "DELETE from Info where idpreso ="+ JOptionPane.showInputDialog("¿Qué Id desea eliminar?\n"+" "+x)+";";
        
            PreparedStatement pst = Conexion_database.co.prepareStatement(SQL);
            pst.execute();
}
     public void show(){
         
     }
}