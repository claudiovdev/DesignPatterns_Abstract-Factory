package com.algaworks.gestorderisco.fControl;

import com.algaworks.gestorderisco.AlertaDeRiscoException;
import com.algaworks.gestorderisco.GestorDeRisco;

import java.math.BigDecimal;

public class FControl implements GestorDeRisco {

	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
    }

}
