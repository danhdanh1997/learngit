package com.org.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class demo {
    public static void main(String[] args) {
        System.out.println("hello xuan danh");

        String path = "c:\\projects\\app.log";

        try {

            // default StandardCharsets.UTF_8
            String content = Files.readString(Paths.get(path));
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setAge(int age){
        age = 25;
        System.out.println("hello xuan thach nha a hihi");
    }
}
