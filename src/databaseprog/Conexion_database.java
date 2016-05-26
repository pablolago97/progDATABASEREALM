package databaseprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_database {

    static Connection co = null;

    public static void conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            co = DriverManager.getConnection("jdbc:mysql://10.0.0.254/bergonpazos?user=bergonpazos&password=bergonpazos");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public Connection getCo() {
        return co;
    }

    public void setCo(Connection co) {
        Conexion_database.co = co;
    }
    
    
}
