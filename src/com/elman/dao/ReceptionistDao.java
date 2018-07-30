/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Receptionist;
import java.util.List;


public interface ReceptionistDao {
    
    boolean registerReceptionist(String first_name,String last_name,String age,String gender,String address,String phoneNumber,String city,String maritalStatus,String username,String password);
   
   public List<Receptionist> getReceptionist(Receptionist receptionist);
   
   public List<Receptionist> getAllReceptionist(Receptionist receptionist);
    
}
