package com.prova.provap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarEscolaridade() {
        Marca marca = new Marca("Fiat");
        Veiculo veiculo = new Veiculo("Azul");
        veiculo.setMarca(marca);
        assertEquals("Fiat", veiculo.getNomeMarca());
    }

    @Test
    void deveRetornarSemMarca() {
        Marca marca = new Marca("fiat");
        Veiculo veiculo = new Veiculo("preta");
        assertEquals("Sem marca", veiculo.getNomeMarca());
    }

    @Test
    void deveInstanciarVeiculo() {
        Veiculo veiculo = new Veiculo("azul");

        assertEquals("azul", veiculo.getCor());
    }

    @Test
    void deveRetonarExcecaoNomeNuloConstrutor() {
        try {
            Veiculo veiculo = new Veiculo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cor é obrigatório", e.getMessage());
        }
    }
    @Test
    void deveRetonarExcecaoNomeVazioConstrutor() {
        try {
            Veiculo veiculo = new Veiculo("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cor é obrigatório", e.getMessage());
        }
    }
    @Test
    void deveMudarCorVeiculo() {
        Veiculo veiculo = new Veiculo("azul");
        veiculo.setCor("amarelo");

        assertEquals("amarelo", veiculo.getCor());
    }

    @Test
    void deveRetonarExcecaoSetNomeNulo() {
        try {
            Veiculo veiculo = new Veiculo("rosa");
            veiculo.setCor(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cor é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoSetCorVazio() {
        try {
            Veiculo veiculo = new Veiculo("rosa");
            veiculo.setCor("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cor é obrigatório", e.getMessage());
        }
    }
}
