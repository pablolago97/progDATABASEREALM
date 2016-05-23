package databaseprog;

import java.sql.SQLException;

class ConexionSQL {

    public static void main(String[] args) throws SQLException {
        
        
        Conexion_database cdb = new Conexion_database();
        Interfazdb idb = new Interfazdb();
        idb.setVisible(true);
        
    }
}
