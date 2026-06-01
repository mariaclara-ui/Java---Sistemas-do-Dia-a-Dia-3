package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_05.entidades;

public class produto {
    private String nome;
    private double preco;

    public produto(String nome,double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
