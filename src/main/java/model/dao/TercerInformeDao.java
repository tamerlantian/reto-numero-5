package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import util.JBDCUtilities;
import model.vo.TercerInformeVo;

public class TercerInformeDao {

    JBDCUtilities utils;

    public TercerInformeDao() {
        this.utils = new JBDCUtilities();
    }

    public LinkedList<TercerInformeVo> tercerInforme() {
        LinkedList<TercerInformeVo> compras = new LinkedList<>();
        try ( Connection conn = this.utils.connect()) {
            String consulta = "SELECT Compra.ID_Compra, Proyecto.Constructora, Proyecto.Banco_Vinculado FROM Compra INNER JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Proveedor = 'Homecenter' and Proyecto.Ciudad = 'Salento'";
            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String id = result.getString(1);
                String constructora = result.getString(2);
                String banco = result.getString(3);

                TercerInformeVo compra = new TercerInformeVo(id, constructora, banco);
                compras.add(compra);
            }
            return compras;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return compras;
    }
}
