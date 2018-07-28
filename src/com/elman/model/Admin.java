/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.model;

import java.time.LocalDateTime;


public class Admin {
    
    private int id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private LocalDateTime last_login_date;

    public Admin() {
    }

    public Admin(int id, String username, String password, String first_name, String last_name, LocalDateTime last_login_date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_login_date = last_login_date;
        
    }

    public Admin(String username, String password, String first_name, String last_name, LocalDateTime last_login_date) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_login_date = last_login_date;
    }

    public Admin(int id) {
        this.id = id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDateTime getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(LocalDateTime last_login_date) {
        this.last_login_date = last_login_date;
    }

    
   

    
    
   
}


