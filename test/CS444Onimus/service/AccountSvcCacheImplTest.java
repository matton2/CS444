/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.service;

import org.junit.Test;
import static org.junit.Assert.*;
import CS444Onimus.domain.*;
import java.util.List;


/**
 *
 * @author matt
 */
public class AccountSvcCacheImplTest {
    
    public AccountSvcCacheImplTest() {
    }

    @Test
    public void testCRUD() {
               
        AccountSvcCacheImpl impl = new AccountSvcCacheImpl();
        List<Account> accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 0);
        
        Account account = new Account();
        
        account.setFirstName("Name");
        account.setLastName("NameLast");
        Login login = new Login();
        login.setUsername("name");
        login.setPassword("123456");
        account.setLogin(login);
        // test create
        account = impl.create(account);
        assertNotNull(account);
        assertNotEquals(account.getId(), 0);
        //test retrive all
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        //test update
        account.setFirstName("Kristin");
        account = impl.update(account);
        accounts = impl.retrieveAll();
        assertEquals(accounts.size(), 1);
        assertEquals(account.getFirstName(), "Kristin");
        //test delete
        account = impl.delete(account);
        assertEquals(accounts.size(), 0);
        
        
        
        
    }
    
}
