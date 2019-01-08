package com.example.test.demo.mysql.model;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;

    public User() {

    }

    public User(String userName, String password, String phone) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "userId : " + userId + "\r\n"
                + "userName : " + userName + "\r\n"
                + "password : " + password + "\r\n"
                + "phone : " + phone;
    }
}
