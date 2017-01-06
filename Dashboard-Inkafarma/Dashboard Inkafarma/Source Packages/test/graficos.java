package test;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class graficos {

    public static void main(String[] args) {
    Connection conn = null;
    String iphost = "localhost";
    String dbsid = "ASKDB";
    String username = "sa";
    String password = "rakel123";

    
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String sql = "SELECT EQUIP_NOMBRE, COUNT(TCKT_NUMERO) FROM TICKET a\n"
                + "	INNER JOIN EQUIPO b ON a.EQUIP_CODIGO = b.EQUIP_CODIGO\n"
                + "	AND MONTH(TCKT_FINICIO) = 12 \n"
                + "	AND YEAR(TCKT_FINICIO) = 16 \n"
                + "	GROUP BY EQUIP_NOMBRE\n"
                + "	ORDER BY COUNT(TCKT_NUMERO) DESC";
        conn = DriverManager.getConnection("jdbc:sqlserver://Muse\\MSSQLSERVER:1433;databaseName=BD_INKAFARMA", username, password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        String[] arr = null;
        while (rs.next()) {
            String em = rs.getString("Equipo");
            arr = em.split("\n");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
    catch (Exception asd) {
            System.out.println(asd);
    }
}
}
