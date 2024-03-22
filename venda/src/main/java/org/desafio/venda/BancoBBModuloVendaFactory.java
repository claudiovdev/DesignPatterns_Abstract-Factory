package org.desafio.venda;

import org.desafio.boleto.Boleta;
import org.desafio.boleto.bancoDoBrasil.BolentoBB;
import org.desafio.nfs.NFe;
import org.desafio.nfs.saoPaulo.SaoPauloNfs;

public class BancoBBModuloVendaFactory implements ModuloVendaFactory{
    @Override
    public NFe criaNfe() {
        return new SaoPauloNfs();
    }

    @Override
    public Boleta criaBoleta() {
        return new BolentoBB();
    }
}
