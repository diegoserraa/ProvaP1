package com.prova.provap1;

public class Esportivo extends Veiculo{

   private String descricao;

    public Esportivo(String cor, String descricao) {
        super(cor);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
