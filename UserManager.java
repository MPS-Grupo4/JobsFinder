package business.control;

import infra.InfraException;
import infra.UserFile;

import java.util.Map;
import java.util.logging.Level;
import java.util.Iterator;
import javax.swing.JOptionPane;

import business.model.User;
import business.util.LoginInvalidException;
import business.util.PasswordInvalidException;
import business.util.UserValidador;


public class UserManager {
	
    private Map<String, String> users;
    UserFile userFile;

    public UserManager() {		
            userFile = new UserFile();
            try {
                users = (Map<String, String>) userFile.loadUsers();
            } catch (InfraException e) {
                    UserFile.logger.log(Level.FINE, e.getMessage());
            } 
    }

    public void addUser(String name, String pass) throws LoginInvalidException, PasswordInvalidException {
            UserValidador.validateName(name);
            UserValidador.validatePassword(pass);
            User user = new User(name, pass);

            users.put(user.getLogin(), user.getSenha());
            userFile.saveUsers(users);
    }

    public void removeUser(String name) throws InfraException {
        Iterator<User> key;
        key = (Iterator) this.getAllClients().keySet().iterator();
        while(key.hasNext()){
            User user = key.next();
            if(user.getLogin().equals(name)){
                key.remove();
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
            }
        }
    }

    public Map<String, String> getAllClients() throws InfraException {
                    try {
                    Map<String, String> mymap = userFile.loadUsers();
                    return mymap;
                    
                    } catch (NullPointerException ex){
                UserFile.logger.severe(ex.getMessage());
                throw new InfraException("Erro de persistencia, contacte o admin ou tente mais tarde");
            }
    }
}
