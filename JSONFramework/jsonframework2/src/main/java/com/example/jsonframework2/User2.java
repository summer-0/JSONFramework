package com.example.jsonframework2;

/**
 * Created by Administrator on 2017/2/19 0019.
 */

public class User2 {
    private int id;
    private String name;
    private String pwd;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
    }
}