package com.gaospell.loginmvp.model;

/**
 * <pre>
 *     @author : JerryLiu
 *     e-mail : liudb@gospell.com
 *     time   : 2018/08/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */


public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
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
}
