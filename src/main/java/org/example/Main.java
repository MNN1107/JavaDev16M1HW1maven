package org.example;


import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       User user = new User("Maryna", "Yeretska");
       Gson gson = new Gson();
       String json = gson.toJson(user);
        System.out.println(json);
        }
    }

