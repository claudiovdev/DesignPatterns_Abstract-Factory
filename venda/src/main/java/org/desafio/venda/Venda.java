package org.desafio.venda;

import org.desafio.boleto.Boleta;
import org.desafio.nfs.NFe;

public class Venda {
    private NFe nFe;
    private Boleta boleta;
    public Venda(ModuloVendaFactory moduloVendaFactory) {
        this.nFe = moduloVendaFactory.criaNfe();
        this.boleta = moduloVendaFactory.criaBoleta();
    }

    public void realizar(){
        nFe.emit();
        boleta.gerar();
    }
}
