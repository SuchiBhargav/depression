package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userid;
    private String username;
    private String email_id;
    private String dob;
    List<Doctors> docid=new ArrayList<>();

    //default constructor
    public User() {
    }

    //parameterized constructor
    public User(Long userid, String username, String email_id, String dob, List<Doctors> docid) {
        this.userid = userid;
        this.username = username;
        this.email_id = email_id;
        this.dob = dob;
        this.docid = docid;
    }
    //parameterized constructor with no doctor assigned
    public User(Long userid, String username, String email_id, String dob) {
        this.userid = userid;
        this.username = username;
        this.email_id = email_id;
        this.dob = dob;
    }

   //getter and setter
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<Doctors> getDocid() {
        return docid;
    }

    public void setDocid(List<Doctors> docid) {
        this.docid = docid;
    }
}
