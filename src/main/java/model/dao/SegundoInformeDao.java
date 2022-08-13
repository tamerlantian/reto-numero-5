package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import model.vo.SegundoInformeVo;
import util.JBDCUtilities;


public class SegundoInformeDao {
    JBDCUtilities util;

    public SegundoInformeDao() {
        this.util = new JBDCUtilities();
    }
    
    public LinkedList<SegundoInformeVo> segundoInforme(){
        LinkedList<SegundoInformeVo> proyectos = new LinkedList<>();
        try(Connection conn = this.util.connect()){
            String consulta = "SELECT ID_Proyecto , Clasificacion , Constructora , Numero_Habitaciones , Ciudad FROM Proyecto WHERE (Ciudad = 'Santa Marta' OR Ciudad = 'Cartagena' OR Ciudad = 'Barranquilla') AND (Clasificacion = 'Casa Campestre')";
            PreparedStatement statement = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            while(result.next()){ 
                String id = result.getString(1);
                String constructora = result.getString(2);
                String numeroHabitaciones = result.getString(3);
                String ciudad = result.getString(4);
                
                SegundoInformeVo segInfo = new SegundoInformeVo(id, constructora, numeroHabitaciones,ciudad);
                proyectos.add(segInfo);
            }
            
            return proyectos;
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return proyectos;
    }     
}
