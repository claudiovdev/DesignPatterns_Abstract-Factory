package com.algaworks.pagamento;

import com.algaworks.gestorderisco.AlertaDeRiscoException;
import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.gestorderisco.clearsale.ClearSale;
import com.algaworks.gestorderisco.fControl.FControl;
import com.algaworks.operadora.CapturaNaoAutorizadaException;
import com.algaworks.operadora.Operadora;
import com.algaworks.operadora.cielo.Cielo;
import com.algaworks.operadora.redecard.RedeCard;
import com.algaworks.pagamento.paypal.PaypalModuloPagamentoFactory;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

public class PagamentoViaPayPalTest {

    private Pagamento pagamento;

    @Before
    public void init() {
        ModuloPagamentoFactory moduloPagamentoFactory = new PaypalModuloPagamentoFactory();
        pagamento = new Pagamento(moduloPagamentoFactory);
    }

    @Test
    public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        Long codigoAutorizacao = pagamento.autorizar("4444.2222", new BigDecimal("200"));
        assertNotNull(codigoAutorizacao);
    }

    @Test(expected=CapturaNaoAutorizadaException.class)
    public void deveNegarCaptura_cartaoInvalido() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        pagamento.autorizar("2222.2222", new BigDecimal("2000"));
    }

    @Test(expected=AlertaDeRiscoException.class)
    public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        pagamento.autorizar("1111.2222", new BigDecimal("5500"));
    }
}
