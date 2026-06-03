package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.aplicativo;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.Cadastro;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.Quartos;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.enums.StatusQuarto;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.ValorHospedagem;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.Pagamento;
import Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades.enums.StatusGeral;

// arrumar o valor de acordo com a quantidade de hospede
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Cadastro cadastro=new Cadastro("","","",0);

        System.out.println("Digite o nome da sua cidade");
        cadastro.setCidade(sc.nextLine());

        System.out.println("Digite a data de chegada");
        cadastro.setDataChegada(sc.nextLine());

        System.out.println("Digite a data de saida");
        cadastro.setDateSaida(sc.nextLine());

        System.out.println("Digite a quantidade de hospedes");
        cadastro.setQuantiHospedes(sc.nextInt());

        List<Quartos> listaquarto = new ArrayList<>();

        listaquarto.add(new Quartos(55, StatusQuarto.DISPONOVEL));
        listaquarto.add(new Quartos(78, StatusQuarto.OCUPADO));
        listaquarto.add(new Quartos(33, StatusQuarto.DISPONOVEL));
        listaquarto.add(new Quartos(111, StatusQuarto.DISPONOVEL));

        for (Quartos numquartos:listaquarto){
            if (numquartos.getStatusquatos()== StatusQuarto.DISPONOVEL){
                System.out.println("Quarto "+numquartos.getNumero()+"disponível");
            }
            //concertar
            System.out.println("Nenhum quarto disponível");
        }
        System.out.println("Você ficara hospedado por "+cadastro.quantiDias()+"dias");
        ValorHospedagem valorHospedagem=new ValorHospedagem(cadastro);
        System.out.println("O valor da hospedagem será de R$ "+valorHospedagem.valorfinal());

        System.out.println("Qual e a forma de pagamento?");
        Pagamento pagamento=new Pagamento("","");
        pagamento.setFormaPagamneto(sc.nextLine());


        System.out.println("O pagamento foi aceito?");
        pagamento.setPagamentoAceito(sc.nextLine());
        if (pagamento.getPagamentoAceito().equalsIgnoreCase("Sim")){
            System.out.println("Pagamento aprovado");
        }
        else {
            StatusGeral status= StatusGeral.PAGAMENTO_RECUSADO;
            System.out.println(status.getDescricao());
        }
        StatusGeral status = StatusGeral.HOSPEDAGEM_REGISTRADA;
        System.out.println("O número da hospedagem será " + cadastro.numeroRegistro());
        System.out.println(status.getDescricao());

        status = StatusGeral.COMFIRMACAO_ENVIADA_POR_EMAIL;
        System.out.println(status.getDescricao());

        status=StatusGeral.RESERVA_CONFIRMADA;
        System.out.println(status.getDescricao());
    }
}
