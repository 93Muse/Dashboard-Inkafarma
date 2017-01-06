package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public static Conexion instance;
    private Connection cnn;
    private String url = "jdbc:sqlserver://Muse\\MSSQLSERVER:1433;databaseName=BD_INKAFARMA";
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String usuario = "sa";
    private String pass = "rakel123";

    private Conexion() {

        try {
            Class.forName(driver);
            cnn = DriverManager.getConnection(url, usuario, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized static Conexion conectar() {

        if (instance == null) {
            instance = new Conexion();
        }
        return instance;

    }

    public Connection getCnn() {
        return cnn;
    }

    public void cerrarConexion() {
        instance = null;
    }
}
