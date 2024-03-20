package org.desafio.venda;

import org.desafio.boleto.Boleta;
import org.desafio.nfs.NFe;

public class Venda {
    private NFe nFe;
    private Boleta boleta;
    public Venda(NFe nFe, Boleta boleta) {
        this.nFe = nFe;
        this.boleta = boleta;
    }

    public void realizar(){
        nFe.emit();
        boleta.gerar();
    }
}
