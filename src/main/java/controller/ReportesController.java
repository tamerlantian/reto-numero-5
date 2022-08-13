package controller;

import java.util.LinkedList;
import model.dao.PrimerInformeDao;
import model.dao.TercerInformeDao;
import model.dao.SegundoInformeDao;
import model.vo.TercerInformeVo;
import model.vo.PrimerInformeVo;
import model.vo.SegundoInformeVo;

public class ReportesController {
    private PrimerInformeDao modeloInforme1;
    private SegundoInformeDao modeloInforme2;
    private TercerInformeDao modeloInforme3;
    
    public ReportesController() {
        this.modeloInforme1 = new PrimerInformeDao();
        this.modeloInforme2 = new SegundoInformeDao();
        this.modeloInforme3 = new TercerInformeDao();
    }
    
    public LinkedList<PrimerInformeVo> primerInforme(){
        LinkedList<PrimerInformeVo> lideres = new LinkedList();
        try {
            lideres = this.modeloInforme1.primerInforme();
        } catch (Exception e){
        
        }
        return lideres;
    }    
    
    public LinkedList<SegundoInformeVo> segundoInforme(){
        LinkedList<SegundoInformeVo> proyectos = new LinkedList();
        try {
            proyectos = this.modeloInforme2.segundoInforme();
            return proyectos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return proyectos;
    }
    
    public LinkedList<TercerInformeVo> tercerInforme() {
        LinkedList<TercerInformeVo> compras = new LinkedList<TercerInformeVo>();
        try {
            compras = this.modeloInforme3.tercerInforme();
            return compras;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return compras;
    }
    
}
