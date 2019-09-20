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
public class Account {
    
    private String firstName = "";
    private String lastName = "";
    private Login login = null;
    private String email = "";

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }
    
    public boolean validate() {
        if (firstName == null || firstName.equals("")) return false;
        if (lastName == null || lastName.equals("")) return false;
        if (login == null) return false;
        
        if (firstName.length() <= 1) return false;
        if (lastName.length() <= 1) return false;
        
        if (lastName.equals(firstName)) return false;
        
        if (!email.contains("@")) return false;
                
        return true;
        
        
    }
    
}
