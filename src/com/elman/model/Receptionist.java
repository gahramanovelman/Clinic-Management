/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Receptionist {
    private int id;
    private String username;
    private String passoword;
    private String first_name;
    private String last_name;
    private String age;
    private String gender;
    private String address;
    private String city;
    private String phoneNumber;
    private String maritalStatus;
    private LocalDateTime last_login_date;
    private String image;
    private List<Appointment> appointments;
            

    public Receptionist() {
    }

    public Receptionist(int id, String username, String passoword, String first_name, String last_name, String age, String gender, String address, String city, String phoneNumber, String maritalStatus, LocalDateTime last_login_date,String image) {
        this.id = id;
        this.username = username;
        this.passoword = passoword;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.maritalStatus = maritalStatus;
        this.last_login_date = last_login_date;
        this.image = image;
        
    }

    public Receptionist(String username, String passoword, String first_name, String last_name, String age, String gender, String address, String city, String phoneNumber, String maritalStatus, LocalDateTime last_login_date,String image) {
        this.username = username;
        this.passoword = passoword;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.maritalStatus = maritalStatus;
        this.last_login_date = last_login_date;
        this.image = image;
    }

    public Receptionist(String username, String passoword) {
        this.username = username;
        this.passoword = passoword;
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

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    public LocalDateTime getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(LocalDateTime last_login_date) {
        this.last_login_date = last_login_date;
    }

    public void getUsername(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
