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
    
}
