/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.may5netbeanproject;

/**
 *
 * @author Kulsum
 */
public class Student {
    private String firstname;
    private int id;
    private String email;

    @Override
    public String toString() {
        return "Student{" + "firstname=" + firstname + ", id=" + id + ", email=" + email + '}';
    }

    public Student(String firstname, int id, String email) {
        this.firstname = firstname;
        this.id = id;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
