package Atividade_Dia_a_Dia06.entidades;

public class ValorHospedagem {
    private Cadastro cadastro;

    public ValorHospedagem(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    public long totalDias(){
        return cadastro.quantiDias();
    }
    public long valorDias(){
        return cadastro.quantiDias()*130*cadastro.getQuantiHospedes();
    }
    public double valorfinal(){
        double valorTotal = valorDias();
        if (cadastro.quantiDias()>5){
            valorTotal = valorTotal* 0.90;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "ValorHospedagem{" +
                "cadastro=" + cadastro ;
    }
}