package Atividade_Dia_a_Dia06.aplicativo;


import Atividade_Dia_a_Dia06.entidades.Cadastro;
import Atividade_Dia_a_Dia06.entidades.Quartos;
import Atividade_Dia_a_Dia06.entidades.enums.StatusQuarto;
import Atividade_Dia_a_Dia06.entidades.ValorHospedagem;
import Atividade_Dia_a_Dia06.entidades.Pagamento;
import Atividade_Dia_a_Dia06.entidades.enums.StatusGeral;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cadastro cadastro=new Cadastro("","","",0,false);

        System.out.println("Digite o nome da sua cidade");
        cadastro.setCidade(sc.nextLine());

        System.out.println("Digite a data de chegada");
        cadastro.setDataChegada(sc.nextLine());

        System.out.println("Digite a data de saida");
        cadastro.setDateSaida(sc.nextLine());

        System.out.println("Digite a quantidade de hospedes");
        cadastro.setQuantiHospedes(sc.nextInt());
        sc.nextLine();

        List<Quartos> listaquarto = new ArrayList<>();

        listaquarto.add(new Quartos(55,StatusQuarto.DISPONiVEL));
        listaquarto.add(new Quartos(78, StatusQuarto.OCUPADO));
        listaquarto.add(new Quartos(33, StatusQuarto.DISPONiVEL));
        listaquarto.add(new Quartos(111, StatusQuarto.DISPONiVEL));



        for (Quartos numquartos:listaquarto){
            if (numquartos.getStatusquatos() == StatusQuarto.DISPONiVEL){
                System.out.println("Quarto " + numquartos.getNumero() + numquartos.getStatusquatos().getDescricao());
                cadastro.encontrou=true;
            }
            if (!cadastro.encontrou){
                System.out.println("Nenhum quarto disponível");
            }


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