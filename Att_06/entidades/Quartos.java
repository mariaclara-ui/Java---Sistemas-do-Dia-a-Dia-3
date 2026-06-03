package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.enums.StatusQuarto;
public class Quartos {
    private int numero;
    private StatusQuarto statusquatos;
    public Quartos(int numero, StatusQuarto statusquatos) {
        this.numero = numero;
        this.statusquatos=statusquatos;
    }
    public StatusQuarto getStatusquatos() {
        return statusquatos;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Quartos" +
                "numero=" + numero +
                ", statusquatos=" + statusquatos;
    }
}

