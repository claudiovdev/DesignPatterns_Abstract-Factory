package org.desafio.venda;
import org.desafio.boleto.bancoDoBrasil.BolentoBB;
import org.desafio.nfs.saoPaulo.SaoPauloNfs;

import org.desafio.boleto.Boleta;
import org.desafio.nfs.NFe;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    private Venda venda;
    private NFe nFe;
    private Boleta boleta;


    @Test
    void deveMostrarPrint(){
        nFe = new SaoPauloNfs();
        boleta = new BolentoBB();
        venda = new Venda(nFe, boleta);

        venda.realizar();
    }

}