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
public class RoundSvcCacheImpl implements IRoundSvc {
    
    private RoundSvcCacheImpl() {
        
    }
    
    private static RoundSvcCacheImpl instance = new RoundSvcCacheImpl();
    
    public static RoundSvcCacheImpl getInstance() {
        return instance;
    }
    
    private List<Round> cache = new ArrayList<>();
    private int nextId = 0;
    
    public Round create (Round round) {
        round.setId(++nextId);
        cache.add(round);
        return round;
    }
    
    public List<Round> retrieveAll() {
        return cache;
    }
    
    public Round update (Round round) {
        for (int i = 0; i < cache.size(); i++) {
            Round next = cache.get(i);
            if(next.getId() == round.getId()) {
                cache.set(i, round);
                break;
            }
        }
        return round;
    }
    
    public Round delete (Round round) {
        for (int i = 0; i < cache.size(); i++) {
            Round next = cache.get(i);
            if(next.getId() == round.getId()) {
                cache.remove(i);
                break;
            }
        }
        return round;
    }
    
    
}
