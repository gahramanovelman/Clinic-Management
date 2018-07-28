/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.main;

import com.elman.dao.AdminDao;
import com.elman.dao.AdminDaoImpl;
import com.elman.model.Admin;
import java.time.LocalDateTime;

/**
 *
 * @author Elman
 */
public class InsertAdmin {
    
    public static void main(String[] args) {
      AdminDao adImpl = new AdminDaoImpl();
     
        Admin admin = new Admin( "admin01", "12345", "Elman", "Gahramanov",null);
        
       // adImpl.insertAdmin(admin);
       
        
    }
    
    
}
