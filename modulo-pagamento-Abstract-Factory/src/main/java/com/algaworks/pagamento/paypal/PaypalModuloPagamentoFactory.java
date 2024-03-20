package com.algaworks.pagamento.paypal;

import com.algaworks.gestorderisco.GestorDeRisco;
import com.algaworks.gestorderisco.clearsale.ClearSale;
import com.algaworks.operadora.Operadora;
import com.algaworks.operadora.redecard.RedeCard;
import com.algaworks.pagamento.ModuloPagamentoFactory;

public class PaypalModuloPagamentoFactory implements ModuloPagamentoFactory {
    @Override
    public Operadora criarOperadora() {
        return new RedeCard();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new ClearSale();
    }
}
