package com.timeshare.domain;

/**
 * Created by tayfer01 on 1/17/2018.
 */
public class User {

    private String emailAddress;
    private String password;
    private long id;
    private boolean isVerified;

    public User(String emailAddress, String password, long id, boolean isVerified) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.id = id;
        this.isVerified = isVerified;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
