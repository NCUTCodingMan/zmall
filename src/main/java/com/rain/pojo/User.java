package com.rain.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author rain
 * created on 2018/3/31
 */
public class User {
    @NotNull
    @Size(min = 1)
    private Integer userId;

    @NotNull
    @Size(min = 1, max = 20)
    private String userName;

    @NotNull
    @Size(min = 1, max = 20)
    private String userPassword;

    @Size(max = 100)
    private String userImg;

    @Size(max = 200)
    private String userAddress;

    @NotNull
    private Date registerDate;

    public User() {}

    public User(Integer userId, String userName, String userPassword, String userImg, String userAddress, Date registerDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userImg = userImg;
        this.userAddress = userAddress;
        this.registerDate = registerDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserImg() {
        return userImg;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}