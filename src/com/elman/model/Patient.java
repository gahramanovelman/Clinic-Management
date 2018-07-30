/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elman.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class Patient {
    
    private int id;
    private String first_name;
    private String last_name;
    private String age;
    private String gender;
    private String address;
    private String city;
    private String phoneNumber;
    private String maritalStatus;
    private String patientType;
    private String serialNumber;
    private String wardNo;
    private String bedNo;
    private LocalDateTime date;

    public Patient() {
    }

    public Patient(int id, String first_name, String last_name, String age, String gender, String address, String city, String phoneNumber, String maritalStatus, String patientType, String serialNumber, String wardNo, String bedNo, LocalDateTime date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.maritalStatus = maritalStatus;
        this.patientType = patientType;
        this.serialNumber = serialNumber;
        this.wardNo = wardNo;
        this.bedNo = bedNo;
        this.date = date;
      
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    
    
    
    
    
}
