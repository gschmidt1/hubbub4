package edu.acc.j2ee.hubbub4;

import java.util.Date;

public class User implements java.io.Serializable {

    private String userName;
    private int profileid;
    private String password;
    private int id;

    public User(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public int getProfileid() {
        return profileid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfileid(int profileid) {
        this.profileid = profileid;
    }

    @Override
    public String toString() {
        return userName;
    }

}
