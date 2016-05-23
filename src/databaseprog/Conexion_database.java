package databaseprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_database {

    Connection co = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            co = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mysqlprog?user=root&password=39510486Mpl-bp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, e);
        }
return co;
    }
}
