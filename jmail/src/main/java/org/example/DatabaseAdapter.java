package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatabaseAdapter {

    private static final String databaseFile = "file.json";
    private final File file = new File(databaseFile);


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
        List<User> users = new ArrayList<>();

        // Step 1: Read existing users if the file exists and is not empty
        if (file.exists() && file.length() > 0) {
            try {
                users = mapper.readValue(file, new TypeReference<List<User>>() {});
            } catch (IOException e) {
                System.err.println("Error reading JSON: " + e.getMessage());
            }
        }

        // Step 2: Add the new user
        users.add(user);

        // Step 3: Write the updated list back to the file
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, users);
            System.out.println("User added successfully.");
        } catch (IOException e) {
            System.err.println("Error writing JSON: " + e.getMessage());
        }

    }
    public static User deleteRow(String email){

    }
    public static User getRow(){

    }
    public static boolean exists(String field, String value){

    }
    public static void  flushDatabase(){

    }

}