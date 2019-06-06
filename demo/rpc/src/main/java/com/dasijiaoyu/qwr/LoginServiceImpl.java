package com.dasijiaoyu.qwr;

public class LoginServiceImpl implements LoginServiceInterface {
    @Override
    public String login(String username, String password) {
        return username + " logged in successfully ";
    }

    public static void main(String[] args){
        System.out.println(11);
    }
}
