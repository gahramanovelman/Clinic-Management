/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Admin;
import java.util.List;


public interface AdminDao {
 
     public Admin getAllAdmin(Admin admin);
     
      public boolean updateLastLoginDateAdmin(int id);
    
    
}
