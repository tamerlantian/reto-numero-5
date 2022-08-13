package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import model.vo.PrimerInformeVo;
import util.JBDCUtilities;

public class PrimerInformeDao {

    JBDCUtilities utils;

    public PrimerInformeDao() {
        this.utils = new JBDCUtilities();
    }

    public LinkedList<PrimerInformeVo> primerInforme() {
        LinkedList<PrimerInformeVo> lideres = new LinkedList<>();
        try ( Connection conn = utils.connect()) {
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";
            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String id = result.getString(1);
                String nombre = result.getString(2);
                String apellido = result.getString(3);
                String ciudad = result.getString(4);
                
                PrimerInformeVo cL = new PrimerInformeVo(id, nombre, apellido, ciudad);
                lideres.add(cL);
            }
            return lideres;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lideres;
    }
}
