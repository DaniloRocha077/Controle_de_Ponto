package com.company;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private String login;
    private String senha;


    public Gerente(int IdFunc, String nome, String email, String documento, String login, String senha) {
        super(IdFunc, nome, email, documento);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo Gerente" + "\n" +
                "Login: " + login + "\n" +
                "Senha: " + senha + "\n";
    }
}
