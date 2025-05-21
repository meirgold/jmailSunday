package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseAdapter {

    private static final String databaseFile = "file.json";
    private final File file = new File(databaseFile);
    private static final ArrayList<User> users = new ArrayList<>();

    public static void  initalize(){
        File file = new File(databaseFile);
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("{}"); // write empty JSON object
                System.out.println("Created new JSON file: " + databaseFile);
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists: " + databaseFile);
        }

    }
    public static boolean addRow(User user){
        try{
        users.add(user);
        return true;

        } catch (RuntimeException e){
            return false;
        }
    }
    public static User deleteRow(String email) {
        for (User user : users) {
            if (user.getMail().equals(email)) {
                users.remove(user);
                return user;
            }
        }
        return null;
    }
    public static User getRow(String email) {
        if (users.isEmpty()) {
            return users.get(0);
        }
        else{
            for (User user : users) {
                if (user.getMail().equals(email)) {
                    return user;
                }
            }
        }

    }

    // Check if a user with a field-value pair exists
    public static boolean exists(String field, String value) {
        for (User user : users) {
            switch (field.toLowerCase()) {
                case "name":
                    if (user.getUserName().equals(value)) return true;
                    break;
                case "email":
                    if (user.getMail().equals(value)) return true;
                    break;
                default:
                    return false;
            }
        }
        return false;
    }
    public static void  flushDatabase(){

    }

}