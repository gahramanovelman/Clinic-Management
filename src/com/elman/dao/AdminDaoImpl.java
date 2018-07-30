/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.dao;

import com.elman.model.Admin;
import com.elman.util.DButil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class AdminDaoImpl implements AdminDao{

   

    @Override
    public Admin getAllAdmin(Admin admin) {
         Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        admin = null;
        String sql = "select * from admin";
        
        try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               
                 admin = new Admin();
                 admin.setId(rs.getInt("id"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                admin.setFirst_name(rs.getString("first_name"));
                admin.setLast_name(rs.getString("last_name"));
                admin.setLast_login_date(rs.getTimestamp("last_login_date").toLocalDateTime());
      
              
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, rs);
        }
        return admin;   
    
    }
    
    
    @Override
    public boolean updateLastLoginDateAdmin(int id) {
       Connection con = null;
       PreparedStatement ps = null;
       ResultSet rs = null;
       boolean result = false;
       String sql = "update admin set last_login_date=? where id=?";
          try {
            con = DButil.getConnect();
            ps = con.prepareStatement(sql);
            ps.setString(1, LocalDateTime.now().toString());
            ps.setInt(2, id);
            ps.executeUpdate();
            result = true;
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            DButil.closeAll(con, ps, rs);
        }
       return result;
    }


    
   

   
    
}


