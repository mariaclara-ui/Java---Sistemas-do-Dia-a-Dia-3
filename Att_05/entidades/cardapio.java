package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_05.entidades;

import java.util.ArrayList;

public class cardapio {
    private ArrayList<produto> itens;
    public cardapio(){
        itens=new ArrayList<>();
        itens.add(new produto("1- Hambúrguer",25.00));
        itens.add(new produto("2- Pizza", 45.00));
        itens.add(new produto("3- Batata Frita", 15.00));
        itens.add(new produto("4- Refrigerante", 8.00));
    }
    public ArrayList<produto> getItens() {
        return itens;
    }
}

