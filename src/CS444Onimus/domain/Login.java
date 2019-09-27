/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.domain;

/**
 *
 * @author matt
 */
public class Login {
    
    private String username = "";
    private String password = "";

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate() {
        if (username == null || username.equals("")) return false;
        if (password == null || password.equals("")) return false;
        if (password.length() < 6) return false;
        if (username.length() < 6) return false;
        if (password.equals("password")) return false;
        if (password.equals("Password")) return false;
        
        return true;
        
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        
        if (!(obj instanceof Login)) return false;
        
        Login login = (Login)obj;
        
        if (!this.username.equals(login.getUsername())) return false;
        if (!this.password.equals(login.getPassword())) return false;
        
        return true;
    }
    
    
    
    
}
