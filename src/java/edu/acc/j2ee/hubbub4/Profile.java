package edu.acc.j2ee.hubbub4;

import java.util.Date;

public class Profile implements java.io.Serializable {   
    private Date joinDate;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private int id;
    
    public Profile(Date joinDate, int id) {
        this.joinDate = joinDate;
        this.id = id;
    }
    
    public Profile(int id) {
        this.id = id;
    }

    public Profile() {
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public int getId() {
        return id;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
