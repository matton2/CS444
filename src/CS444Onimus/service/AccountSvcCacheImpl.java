/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.service;

import CS444Onimus.domain.*;
import java.util.*;

/**
 *
 * @author matt
 */
public class AccountSvcCacheImpl implements IAccountSvc {
    
    private List<Account> cache = new ArrayList<>();
    private int nextId = 0;
    
    public Account create (Account account) {
        account.setId(++nextId);
        cache.add(account);
        return account;
    }
    
    public List<Account> retrieveAll() {
        return cache;
    }
    
    public Account update (Account account) {
        return account;
    }
    
    public Account delete (Account account) {
        return account;
    }
}
