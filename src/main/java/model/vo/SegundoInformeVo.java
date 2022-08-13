package model.vo;

public class SegundoInformeVo {
    private String proyectoId;
    private String constructora;
    private String numeroHabitaciones;
    private String ciudad;

    public SegundoInformeVo(String proyectoId, String constructora, String numeroHabitaciones, String ciudad) {
        this.proyectoId = proyectoId;
        this.constructora = constructora;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ciudad = ciudad;
    }

    public String getProyectoId() {
        return proyectoId;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SegundoInformeVo{");
        sb.append("proyectoId=").append(proyectoId);
        sb.append(", constructora=").append(constructora);
        sb.append(", numeroHabitaciones=").append(numeroHabitaciones);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }

    
}
