package Java_criacao_app.Atividade_Sistemas_dia_a_dia.Att_05.entidades;

public class login {
    private String email;
    private String senha;

    public login(String email,String senha) {
        this.email = email;
        this.senha=senha;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "login{" +
                "email='" + email +
                ", senha='" + senha ;
    }
}
