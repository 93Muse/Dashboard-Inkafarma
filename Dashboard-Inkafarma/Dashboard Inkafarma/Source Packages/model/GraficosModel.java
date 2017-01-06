package model;
import DAO.GraficaDAO;
import java.sql.ResultSet;

public class GraficosModel {
    
    public ResultSet reportes(String mes) throws Exception {
        ResultSet rs = null;
        GraficaDAO gdo = new GraficaDAO();
        rs = gdo.reportes(mes);
        return rs;
    }
    
}
