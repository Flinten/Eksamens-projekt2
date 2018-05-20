package com.example.demo.Utilities;

/**
 * Created by Ejer on 11-05-2018.
 */
public class Admin {
    private int adminId;
    private String userName;
    private String password;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Admin(){

    }

    public int getId() {
        return adminId;
    }

    public void setId(int id) {
        this.adminId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + adminId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
