package model.vo;

public class TercerInformeVo {
    private String id;
    private String constructora;
    private String banco;

    public TercerInformeVo(String id, String constructora, String banco) {
        this.id = id;
        this.constructora = constructora;
        this.banco = banco;
    }

    public String getId() {
        return id;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TercerInformeVo{");
        sb.append("id=").append(id);
        sb.append(", constructora=").append(constructora);
        sb.append(", banco=").append(banco);
        sb.append('}');
        return sb.toString();
    }
}
