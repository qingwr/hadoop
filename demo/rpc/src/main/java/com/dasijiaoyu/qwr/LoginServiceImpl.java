package com.dasijiaoyu.qwr;

public class LoginServiceImpl implements LoginServiceInterface {
    @Override
    public String login(String username, String password) {
        System.out.println("logged username=" + username);
        return username + " logged in successfully ";
    }
}
