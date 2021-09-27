package com.prova.provap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcaTest {

    @Test
    void deveRetornarNomeMarca(){
        Marca marca = new Marca("Marca");
        assertEquals("Marca", marca.getNome());

    }

    @Test
    void deveRetornarExcecaoConstrutorNomeNulo(){
        try{
            Marca marca = new Marca(null);
            fail();
        }
        catch (NullPointerException e){
            assertEquals("Nome e obrigatorio", e.getMessage());

        }
    }
    @Test
    void deveRetornarMarcaSet(){
        Marca marca = new Marca("fiat");
        marca.setNome("honda");
        assertEquals("honda", marca.getNome());

    }
    @Test
    void deveRetornarExcecaoSetNomeNulo(){
        try{
            Marca marca = new Marca("fiat");
            marca.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome e obrigatorio", e.getMessage());

        }
    }

}