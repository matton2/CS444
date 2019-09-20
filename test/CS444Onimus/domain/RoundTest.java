/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.domain;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matt
 */
public class RoundTest {
    
    public RoundTest() {
    }

    @Test
    public void testValidate() {
        
        Round round = new Round();
        boolean result = round.validate();
        assertFalse(result);
        round.setCourseName("New Course");
        result = round.validate();
        assertTrue(result);
        
        
        
    }
    
}
