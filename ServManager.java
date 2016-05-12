/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.model.Job;
import infra.InfraException;
import infra.ServFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class ServManager {
    private ArrayList<Job> servs = new ArrayList();
    ServFile servFile;
	
    public ServManager() {		

        servFile = new ServFile();
        try {
            servs = (ArrayList<Job>) servFile.loadServs();
        } catch (InfraException e) {
                ServFile.logger.log(Level.FINE, e.getMessage());
        } 
    }

    public void addServ(String nome, String prestador, String tipo, 
        double preco, String descricao, double avaliacao, boolean atendimento){

        Job serv = new Job(nome, prestador, tipo, preco, descricao, avaliacao, atendimento);

        servs.add(new Job(serv.getNome(), serv.getPrestador(), serv.getTipo(), serv.getPreco(), serv.getDescricao(), serv.getAvaliacao(), serv.isAtendimento()));
        servFile.saveServs(servs);
    }

    public void removeServ(String name) throws InfraException {
        Iterator<Job> key;
        key = (Iterator) this.getAllServicos().iterator();
        while(key.hasNext()){
            Job serv = key.next();
            if(serv.getNome().equals(name)){
                key.remove();
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
            }
        }
    }

    public ArrayList<Job> getAllServicos() throws InfraException {
        try {
            ArrayList<Job> mylist = servFile.loadServs();
            return mylist;
            
        } catch (NullPointerException ex){
            ServFile.logger.severe(ex.getMessage());
            throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
        }
    }
}
