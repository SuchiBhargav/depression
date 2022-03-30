package com.user.entity;

public class Doctors {

    private Long userid;
    private String username;
    private Integer experience;
    private String dob;


    public Doctors() {
    }

    public Doctors(Long userid, String username, Integer experience, String dob) {
        this.userid = userid;
        this.username = username;
        this.experience = experience;
        this.dob = dob;
    }

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

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
