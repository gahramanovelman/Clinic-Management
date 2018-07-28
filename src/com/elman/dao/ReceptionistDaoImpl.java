/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Receptionist;
import com.elman.util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elman
 */
public class ReceptionistDaoImpl implements ReceptionistDao{

    @Override
    public boolean registerReceptionist(String first_name, String last_name,String age, String gender,String address, String phoneNumber, String city, String maritalStatus,String username,String password) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        String sql = "insert into receptionist(first_name,last_name,gender,age,address,phone_number,city,marital_status,username,password) values(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, gender);
            ps.setString(4, age);
            ps.setString(5, address);
            ps.setString(6, phoneNumber);
            ps.setString(7, city);
            ps.setString(8, maritalStatus);
            ps.setString(9, username);
            ps.setString(10, password);
            
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, null);
        }
        
        return result;
    }

    @Override
    public List<Receptionist> getReceptionist(Receptionist receptionist) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Receptionist> list = new ArrayList();
        String sql = "select username,password from receptionist";
        
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                 receptionist = new Receptionist();
               receptionist.setUsername(rs.getString("username"));
                receptionist.setPassoword(rs.getString("password"));
                list.add(receptionist);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, rs);
        }
        return list;   
    
    }

    @Override
    public List<Receptionist> getAllReceptionist(Receptionist receptionist) {
         Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Receptionist> list = new ArrayList();
        String sql = "select * from receptionist";
        
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                 receptionist = new Receptionist();
                 receptionist.setId(rs.getInt("id"));
                receptionist.setUsername(rs.getString("username"));
                receptionist.setPassoword(rs.getString("password"));
                receptionist.setFirst_name(rs.getString("first_name"));
                receptionist.setLast_name(rs.getString("last_name"));
                receptionist.setGender(rs.getString("gender"));
                receptionist.setAge(rs.getString("age"));
                receptionist.setAddress(rs.getString("address"));
                receptionist.setCity(rs.getString("city"));
                receptionist.setPassoword(rs.getString("password"));
                receptionist.setPhoneNumber(rs.getString("phone_number"));
                receptionist.setMaritalStatus(rs.getString("marital_status"));
                

                list.add(receptionist);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, rs);
        }
        return list;   
    
    }
}
