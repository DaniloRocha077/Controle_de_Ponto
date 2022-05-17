package com.company;

public class Funcionario {
    private int IdFunc;
    private String nome;
    private String email;
    private String documento;

    public Funcionario(int idFunc, String nome, String email, String documento) {
        IdFunc = idFunc;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public int getIdFunc() {
        return IdFunc;
    }

    public void setIdFunc(int idFunc) {
        IdFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "--Funcionario--" + "\n" +
                "IdFunc: " + IdFunc + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Documento: " + documento + "\n";
    }
}
