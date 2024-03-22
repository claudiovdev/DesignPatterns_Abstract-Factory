package org.desafio.venda;
import org.desafio.boleto.bancoDoBrasil.BolentoBB;
import org.desafio.nfs.saoPaulo.SaoPauloNfs;

import org.desafio.boleto.Boleta;
import org.desafio.nfs.NFe;
import org.junit.jupiter.api.Test;

class VendaTest {
    private Venda venda;
    private NFe nFe;
    private Boleta boleta;


    @Test
    void deveMostrarPrint(){
       ModuloVendaFactory moduloVendaFactory = new BancoBBModuloVendaFactory();
        venda = new Venda(moduloVendaFactory);

        venda.realizar();
    }

}