package DAO;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GraficaDAO {
    
    private static final Conexion con = Conexion.conectar();
    private static PreparedStatement ps = null;
    private static ResultSet res = null; 
    
    public ResultSet reportes(String mes) throws Exception {
            String sql = "SELECT EQUIP_NOMBRE, COUNT(TCKT_NUMERO) FROM TICKET a\n" +
"	INNER JOIN EQUIPO b ON a.EQUIP_CODIGO = b.EQUIP_CODIGO\n" +
"	AND MONTH(TCKT_FINICIO) = " +mes +"\n" +
"	AND YEAR(TCKT_FINICIO) = 2016\n" +
"	GROUP BY EQUIP_NOMBRE\n" +
"	ORDER BY COUNT(TCKT_NUMERO) DESC";
            
            ps = con.getCnn().prepareStatement(sql);
            res = ps.executeQuery();
            System.out.println("" + sql);
            return res;
    }
    
}
