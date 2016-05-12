/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

public class Factory {
    public Factory(String nome, String prestador, String tipo, 
            double preco, String descricao, double avaliacao, boolean atendimento){
        ServManager servico = new ServManager();

        servico.addServ(nome, prestador, tipo, preco, descricao, avaliacao, atendimento);
    }
}
