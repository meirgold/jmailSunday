package org.example;
import java.util.UUID;

public class User
{
    private String userName;
    private String password;
    private String mail;
    private String id;

    public User(String userName, String password, String mail)
    {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        this.id = UUID.randomUUID().toString(); // Generates a UUID v4
    }

    public String getId()
    {
        return id;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }

    public String getMail()
    {
        return mail;
    }

    public void setUsername(String username)
    {
        this.userName = username;
    }

    public void setEmail(String email)
    {
        this.mail = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


}
