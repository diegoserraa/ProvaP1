package com.prova.provap1;

public class Veiculo {

    private String cor;

    private Marca marca;

    private Cidade cidade;

    public Veiculo(String cor) {
        if ((cor == null) || (cor.trim().equals(""))) {
            throw new NullPointerException("Cor é obrigatório");
        }
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if ((cor == null) || (cor.trim().equals(""))) {
            throw new NullPointerException("Cor é obrigatório");
        }
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNomeMarca() {
        if (this.marca == null) {
            return "Sem marca";
        }
        else {
            return this.marca.getNome();
        }
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNomeEstadoCidade() {
        if (this.cidade == null) {
            return "Sem naturalidade";
        }
        else {
            return this.cidade.getNomeEstado();
        }
    }

    public String getNomeCidadeCidade() {
        if (this.cidade == null) {
            return "Sem naturalidade";
        }
        else {
            return this.cidade.getNome();
        }
    }
}
