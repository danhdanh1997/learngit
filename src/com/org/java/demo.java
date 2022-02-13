package com.org.java;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class demo {
    public static void main(String[] args) {
        System.out.println("hello xuan danh");

//        String path = "c:\\projects\\app.log";
//
//        try {
//
//            // default StandardCharsets.UTF_8
//            String content = Files.readString(Paths.get(path));
//            System.out.println(content);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Instant instant = Instant.now();

        System.out.println("Instant : " + instant);

        //Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

        System.out.println("LocalDateTime : " + ldt);
    }

    public void setAge(int age){
        age = 25;
        System.out.println("hello xuan thach nha a hihi");
    }
}
