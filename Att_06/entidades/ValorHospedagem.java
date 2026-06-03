package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.Cadastro;


public class ValorHospedagem {
    private Cadastro cadastro;

    public ValorHospedagem(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    public long totalDias(){
        return cadastro.quantiDias();
    }
    public long valorDias(){
       return cadastro.quantiDias()*130;
    }
    public long valorfinal(){
        double valorTotal = valorDias();
        if (cadastro.quantiDias()>5){
            valorTotal = valorTotal* 0.90;
        }
        return valorfinal();
    }

    @Override
    public String toString() {
        return "ValorHospedagem{" +
                "cadastro=" + cadastro ;
    }
}
