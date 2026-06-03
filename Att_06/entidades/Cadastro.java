package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;


public class Cadastro {

    private String cidade;
    private String dataChegada;
    private String dataSaida;
    private int quantiHospedes;

    public int numeroRegistro(){
        Random random=new Random();
        return random.nextInt(1000);
    }

    public Cadastro(String cidade, String dataChegada, String dateSaia, int quantiHospedes) {
        this.cidade = cidade;
        this.dataChegada = dataChegada;
        this.dataSaida = dateSaia;
        this.quantiHospedes = quantiHospedes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getDateSaida() {
        return dataSaida;
    }

    public void setDateSaida(String dateSaida) {
        this.dataSaida = dateSaida;
    }

    public int getQuantiHospedes() {
        return quantiHospedes;
    }

    public void setQuantiHospedes(int quantiHospedes) {
        this.quantiHospedes = quantiHospedes;
    }
    public long quantiDias() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate chegada = LocalDate.parse(dataChegada, formato);
        LocalDate saida = LocalDate.parse(dataSaida, formato);
        return ChronoUnit.DAYS.between(chegada, saida);
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "cidade='" + cidade +
                ", dataChegada='" + dataChegada +
                ", dataSaida='" + dataSaida +
                ", quantiHospedes=" + quantiHospedes ;
    }
}
