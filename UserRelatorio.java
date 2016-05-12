/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import infra.UserFile;
import infra.InfraException;


public class UserRelatorio extends Relatorio{
    public UserRelatorio(){
        super();
        UserFile users = new UserFile();
        try{
            System.out.println(users.loadUsers());
        }
        catch (InfraException e){
            System.out.println("ERRO!");
        }
    }
    
}
