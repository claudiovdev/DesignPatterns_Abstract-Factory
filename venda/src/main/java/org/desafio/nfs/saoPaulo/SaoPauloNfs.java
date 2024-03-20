package org.desafio.nfs.saoPaulo;

import org.desafio.nfs.NFe;

public class SaoPauloNfs implements NFe {
    @Override
    public void emit() {
        System.out.println("Boleto emitido por são paulo, com taxa 5%");
    }
}
