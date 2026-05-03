package model;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nome;
    private String cidade;
    private String login; // Terceiro atributo obrigatório

    public Usuario(String nome, String cidade, String login) {
        this.nome = nome;
        this.cidade = cidade;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " | Cidade: " + cidade + " | Login: " + login;
    }
}