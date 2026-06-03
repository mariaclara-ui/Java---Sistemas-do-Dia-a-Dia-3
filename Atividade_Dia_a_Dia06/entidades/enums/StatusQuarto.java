package Atividade_Dia_a_Dia06.entidades.enums;

public enum StatusQuarto {
    DISPONiVEL(" disponivel"),
    OCUPADO( "ocupado");
    private String descricao;

    StatusQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
