package org.desafio.venda;

import org.desafio.boleto.Boleta;
import org.desafio.nfs.NFe;

public interface ModuloVendaFactory {
    public NFe criaNfe();
    public Boleta criaBoleta();
}
