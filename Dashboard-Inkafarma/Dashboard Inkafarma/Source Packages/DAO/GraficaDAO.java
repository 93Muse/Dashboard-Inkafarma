package DAO;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.JSONObject;

public class GraficaDAO {

    private static final Conexion con = Conexion.conectar();
    private static PreparedStatement ps = null;
    private static ResultSet res = null;

    public ResultSet reporteMensual(String mes, String anio) throws Exception {

        String sql = "SELECT EQUIP_NOMBRE, COUNT(TCKT_NUMERO) FROM TICKET a\n"
                + "	INNER JOIN EQUIPO b ON a.EQUIP_CODIGO = b.EQUIP_CODIGO\n"
                + "	AND MONTH(TCKT_FINICIO) = ? \n"
                + "	AND YEAR(TCKT_FINICIO) = ? \n"
                + "	GROUP BY EQUIP_NOMBRE\n"
                + "	ORDER BY COUNT(TCKT_NUMERO) DESC";

        try {
            ps = con.getCnn().prepareStatement(sql);
            ps.setString(1, mes.toString());
            ps.setString(2, anio.toString());
            res = ps.executeQuery();

            String[] arr = null;
            while (res.next()) {
                String em = res.getString("Equipo");
                arr = em.split("\n");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
            return res;
        } catch (SQLException ex) {

        } finally {
            try {
                if (res != null) {
                    res.close();
                }
                if (ps != null) {
                    ps.close();
                }
                con.cerrarConexion();
            } catch (Exception e) {
            }
        }
        return res;
    }
}
