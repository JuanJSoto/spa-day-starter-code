package org.launchcode.spaday.model;

import javax.validation.constraints.*;

public class User {
    private static int id;
    private static int nextId=1;

    @NotEmpty
    @NotNull
    @Size(min=5,max=15)
    private String username;

    @Email
    private String email;

    @Min(6)
    private String password;

    public User(){
        id=nextId;
        nextId++;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String email, String password){
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static int getId() { return id; }
}
