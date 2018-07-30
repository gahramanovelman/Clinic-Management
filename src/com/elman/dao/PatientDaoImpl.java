/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Patient;
import com.elman.util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class PatientDaoImpl implements PatientDao{

    @Override
    public List<Patient> getAllPatientData(Patient patient) {
       Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Patient> patientList = new ArrayList();
        String sql = "select * from patient";
        
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setFirst_name(rs.getString("first_name"));
                patient.setLast_name(rs.getString("last_name"));
                patient.setAge(rs.getString("age"));
                patient.setGender(rs.getString("gender"));
                patient.setAddress(rs.getString("address"));
                patient.setPhoneNumber(rs.getString("phone_number"));
                patient.setMaritalStatus(rs.getString("marital_status"));
                patient.setPatientType(rs.getString("patient_type"));
                patient.setSerialNumber(rs.getString("serial_number"));
                patient.setBedNo(rs.getString("bed_no"));
                patient.setWardNo(rs.getString("ward_no"));
                patient.setDate(rs.getTimestamp("date").toLocalDateTime());
                
                patientList.add(patient);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, rs);
        }
        return patientList;
        }

    @Override
    public boolean addNewPatient(int id,String firstName, String lastName, String age, String gender, String address, String city, String phoneNumber, String maritalStatus, String patientType, String serialNumber, String wardNo, String bedNo,LocalDateTime date) {
       Connection con = null;
       PreparedStatement ps = null;
       boolean result = false;
       String sql = "insert into patient (id,first_name,last_name,age,gender,address,city,phone_number,marital_status,patient_type,serial_number,ward_no,bed_no,date) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setString(4, age);
            ps.setString(5, gender);
            ps.setString(6, address);
            ps.setString(7, city);
            ps.setString(8, phoneNumber);
            ps.setString(9, maritalStatus);
            ps.setString(10, patientType);
            ps.setString(11, serialNumber);
            ps.setString(12, wardNo);
            ps.setString(13, bedNo);
            ps.setString(14, date.toString());
             result = true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, null);
        }
        return result;
    }

  

   
    
}
