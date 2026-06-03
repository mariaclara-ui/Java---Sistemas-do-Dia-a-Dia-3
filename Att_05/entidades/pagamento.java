package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_05.entidades;

public class pagamento {
    private double totalCompra;
    private String formaPagamento;
    private String pagamentoAceito;
    private int numeroPedido;

    public double getTotalCompra() {
        return totalCompra;
    }

    public void adicionarValor(double valor) {
        totalCompra += valor;
    }

    public void taxaIntrega() {
        if (totalCompra < 50.00) {
            totalCompra += 8;
            System.out.println("O valor total da compra com a taxa de entrega será: " + totalCompra + " R$");
        } else {
            System.out.println("Frete grátis");
        }
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getPagamentoAceito() {
        return pagamentoAceito;
    }

    public void setPagamentoAceito(String pagamentoAceito) {
        this.pagamentoAceito = pagamentoAceito;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public String toString() {
        return "pagamento{" +
                "formaPagamento='" + formaPagamento +
                ", totalCompra=" + totalCompra +
                ", pagamentoAceito='" + pagamentoAceito +
                ", numeroPedido=" + numeroPedido
                ;
    }
}
