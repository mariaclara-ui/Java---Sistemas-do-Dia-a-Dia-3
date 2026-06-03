package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_06.entidades;

public class Pagamento {
    private String formaPagamento;
    private String pagamentoAceito;


    public Pagamento(String formaPagamneto, String pagamentoAceito) {
        this.formaPagamento = formaPagamneto;
        this.pagamentoAceito=pagamentoAceito;
    }

    public void setPagamentoAceito(String pagamentoAceito) {
        this.pagamentoAceito = pagamentoAceito;
    }

    public String getPagamentoAceito() {
        return pagamentoAceito;
    }

    public String getFormaPagamneto() {
        return formaPagamento;
    }
    public void setFormaPagamneto(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "formaPagamento='" + formaPagamento + ", pagamentoAceito='" + pagamentoAceito;
    }
}
