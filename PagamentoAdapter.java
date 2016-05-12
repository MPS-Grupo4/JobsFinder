/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

public class PagamentoAdapter{
    double valor;
    public PagamentoAdapter(String tipo, double preço){
        valor = preço;
        Pagamento pag = new Pagamento(valor);
        
        switch(tipo){
            case "PayPal":
                pag.payPal(preço);
                break;
            case "Boleto":
                pag.boletoBancario(preço);
                break;
            default:
                break;
        }
    }
}
