package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCUtilities {    
    public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:ProyectosConstruccion.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            return conn;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
