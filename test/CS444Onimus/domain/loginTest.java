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
public class loginTest {
    
    public loginTest() {
    }
    

    @Test
    public void testValidate() {
        Login login1 = new Login();
        boolean result = login1.validate();
        assertFalse(result);
        login1.setUsername("some");
        result = login1.validate();
        assertFalse(result);
        login1.setUsername("someName");
        result=login1.validate();
        assertFalse(result);
        login1.setPassword("345");
        result=login1.validate();
        assertFalse(result);
        login1.setPassword("password");
        result=login1.validate();
        assertFalse(result);
        login1.setPassword("345668");
        result=login1.validate();
        assertTrue(result);
        
        
 
    }
    
    @Test
    public void testEquals() {
        Login login1 = new Login();
        login1.setUsername("johndoe");
        login1.setPassword("123456");
        
        Login login2 = new Login();
        login2.setUsername("somethingelse");
        login2.setPassword("154684");
        
        assertFalse(login1.equals(login2));
        login2.setUsername("johndoe");
        assertFalse(login1.equals(login2));
        login2.setPassword("123456");
        assertTrue(login1.equals(login2));
    }
    
}
