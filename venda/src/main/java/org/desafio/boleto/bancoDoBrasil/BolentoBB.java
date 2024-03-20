package org.desafio.boleto.bancoDoBrasil;

import org.desafio.boleto.Boleta;

public class BolentoBB implements Boleta {
    @Override
    public void gerar() {
        System.out.println("Boleta gerada pelo banco do brasil");
    }
}
