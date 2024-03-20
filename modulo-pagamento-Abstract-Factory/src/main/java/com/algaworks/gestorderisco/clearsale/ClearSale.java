package com.algaworks.gestorderisco.clearsale;

import com.algaworks.gestorderisco.AlertaDeRiscoException;
import com.algaworks.gestorderisco.GestorDeRisco;

import java.math.BigDecimal;

public class ClearSale implements GestorDeRisco {
    @Override
    public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
        if (cartao.startsWith("1111")) {
            throw new AlertaDeRiscoException("Cartão suspeito.");
        }
    }
}
