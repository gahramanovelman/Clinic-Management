/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DButil {
      public static Connection getConnect(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/clinic";
            String username = "root";
            String password = "masterelman";
            connection = DriverManager.getConnection(url, username, password);        }
        catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
    
    public static void closeAll(Connection con,PreparedStatement ps,ResultSet rs){
        try{
            if(con!=null){
                con.close();
            }
             if(ps!=null){
                ps.close();
            }
              if(rs!=null){
                rs.close();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
}
