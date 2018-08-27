package com.baixue.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String id;
    private String username;
    private String password;
    private Date bir;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bir=" + bir +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public User() {
    }

    public User(String id, String username, String password, Date bir) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.bir = bir;
    }
}
