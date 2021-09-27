package com.prova.provap1;

public class Cliente extends Pessoa{
     private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente(String nome, String dataNascimento, Integer id) {
        super(nome, dataNascimento);
        this.id = id;
    }
}
