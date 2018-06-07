package com.example.jsonframework2;

public class User {
    /**
     *   {
     *       "name": "";
     *       "password" : 123456
     *   }
     *
     *
     */
    String name;
    Long password;
    boolean vip;

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public User() {
    }

    public User(String name, Long password) {
        this.name = name;
        this.password = password;

    }

    public User(String name, Long password, boolean vip) {
        this.name = name;
        this.password = password;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }
}
