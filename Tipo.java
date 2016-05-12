/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;


public class Tipo {
    public Tipo(String tipo){
        switch(tipo){
            case "Domestico":
                Domestico dom = new Domestico();
                break;
            
            case "Manutencao":
                Manutencao man = new Manutencao();
                break;
        }
    }
}
