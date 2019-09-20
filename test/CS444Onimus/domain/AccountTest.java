/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.domain;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matt
 */
public class AccountTest {
    
    public AccountTest() {
    }

    @Test
    public void testValidate() {
        Account account = new Account();
        boolean result = account.validate();
        assertFalse(result);
        account.setFirstName("B");
        result = account.validate();
        assertFalse(result);
        account.setFirstName("Bob");
        result = account.validate();
        assertFalse(result);
        account.setLastName("B");
        result = account.validate();
        assertFalse(result);
        account.setLastName("Bob");
        result = account.validate();
        assertFalse(result);
        account.setLastName("Bobb");
        result = account.validate();
        assertFalse(result);
        account.setEmail("something");
        result = account.validate();
        assertFalse(result);
        account.setEmail("something@something.com");
        result = account.validate();
        assertFalse(result);
        Login login = new Login();
        login.setUsername("bob");
        login.setPassword("123456");
        account.setLogin(login);
        result = account.validate();
        assertTrue(result);
        
        
        
        
        
        
        
        
        
    }
    
}
