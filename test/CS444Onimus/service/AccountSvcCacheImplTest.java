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
               
        //AccountSvcCacheImpl impl = new AccountSvcCacheImpl();
        AccountSvcCacheImpl impl = AccountSvcCacheImpl.getInstance();
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
        
        Account account1 = new Account();
        account1.setFirstName("something");
        account1.setLastName("somethingelse");
        Login login1 = new Login();
        login1.setUsername("somet");
        login1.setPassword("123456");
        account1.setLogin(login1);
        account1 = impl.create(account1);
        assertNotNull(account1);
        
        Account account2 = new Account();
        account2.setFirstName("newname");
        account2.setLastName("lastname");
        Login login2 = new Login();
        login2.setUsername("newn");
        login2.setPassword("321654");
        account2.setLogin(login2);
        account2 = impl.create(account2);
        assertNotNull(account2);
        
        Login login3 = new Login();
        login3.setUsername("foo");
        login3.setPassword("barbar");
        Account authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);
        login3.setUsername("newn");
        authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);
        login3.setPassword("321654");
        authenticateAccount = impl.authenticate(login3);
        assertNotNull(authenticateAccount);
        login3.setUsername("somet");
        authenticateAccount = impl.authenticate(login3);
        assertNull(authenticateAccount);
        login3.setPassword("123456");
        authenticateAccount = impl.authenticate(login3);
        assertNotNull(authenticateAccount);
        
        
        
        
    }
    
}
