package business.model;

import java.io.Serializable;


public class User implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = -3409171233621036055L;


    private String login, senha;
    
    public User(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
    }
    
    public boolean equals(Object obj) { 
        if (obj == null) 
            return false; 
        if (this.getClass() != obj.getClass()) 
            return false; 
        String name = obj.toString(); 
        return this.toString().equals(name); 
    }
    
    public int hashCode() {
        return this.toString().hashCode();
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

  
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
    
    public String toString() { 
        return new StringBuilder 
        (this.getClass().getName()).append("#").append(this.getLogin()).toString();
    }


	
    
}
