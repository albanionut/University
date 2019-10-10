package com.self.homework3;

import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;

    public User(String fname, String lname, Date birthDate) {
        this.fname = fname;
        this.lname = lname;
        this.birthDate = birthDate;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User anotherUser = (User) obj;
            if (this.fname.equals(anotherUser.fname) && this.lname.equals(anotherUser.lname) && this.birthDate.equals(anotherUser.birthDate)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
