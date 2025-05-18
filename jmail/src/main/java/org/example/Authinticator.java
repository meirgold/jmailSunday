package org.example;

public class Authinticator extends User{
    private Authinticator(){

    }

    private User emailCheck(String email, String password){
        if (CheckEmail(email)){
            if (CheckPassword(password)){
                return getUser(email);
            }
        }
        else return Null;
    }
}
