/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.service;

import CS444Onimus.domain.*;
import CS444Onimus.domain.*;
import java.util.List;

/**
 *
 * @author matt
 */
public interface IRoundSvc {
    
    public Round create(Round round);
    public List<Round> retrieveAll();
    public Round update(Round round);
    public Round delete(Round round);
    
    
}
