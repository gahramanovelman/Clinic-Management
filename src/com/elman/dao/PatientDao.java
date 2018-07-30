/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Patient;
import java.time.LocalDateTime;
import java.util.List;

public interface PatientDao {

   public List<Patient> getAllPatientData(Patient patient);
   
   public boolean addNewPatient(int id,String first_name,String last_name,String age,String gender,String address,String city,String phoneNumber,String maritalStatus,String patientType,String serialNumber,String wardNo,String bedNo,LocalDateTime date);
   
}

