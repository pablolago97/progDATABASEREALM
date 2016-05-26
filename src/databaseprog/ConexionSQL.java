package databaseprog;

import java.sql.SQLException;

class ConexionSQL {

    public static void main(String[] args) throws SQLException {
        
        
        Conexion_database.conexion();
        Interfazdb idb = new Interfazdb();
        idb.setVisible(true);
        
    }
}
