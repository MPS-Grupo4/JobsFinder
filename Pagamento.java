/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

public class Pagamento {
    
    public Pagamento(){
        super();
    }
    public Pagamento (double valor) {
        if(valor == 25){
            //Autoriza pagamento
            System.out.println("Pagamento realizado com sucesso!");
        }
        else{
            //Recusa tentativa de pagamento
            System.out.println("Pagamento não autorizado!");
        }
    }
    
    public void payPal(double valor){
        Pagamento p = new Pagamento(valor);
        //Realiza a conexão com o servidor do PayPal
    }
    
    public void boletoBancario(double valor){
        Pagamento p = new Pagamento(valor);
        //Realiza conexão com o servidor bancário
    }
}
