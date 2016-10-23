package com.example.user.myapplication;

/**
 * Created by User on 8/28/2016.
 */
public class Login {
    public String username;
    public String password;

    public boolean login(String username,String password){
        boolean pass = false;
        System.out.println(username);
        System.out.println(password);
        if(username.equals("50sum") && password.equals("alpha")){
            pass = true;
        }
        else{
            pass = false;
        }
        return pass;
    }
}
