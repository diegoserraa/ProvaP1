package com.prova.provap1;

public class Utilitario extends Veiculo{

    private String consumo;

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Utilitario(String cor, String consumo) {
        super(cor);
        this.consumo = consumo;
    }
}
