package com.prova.provap1;

public class Marca {

    private String nome;

    public Marca(String nome) {
        if ((nome == null) || (nome.trim() == "")){
            throw new NullPointerException("Nome e obrigatorio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim() == "")){
            throw new NullPointerException("Nome e obrigatorio");
        }
        this.nome = nome;
    }
}
