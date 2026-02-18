package com.secuho.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringstudyApplication.class, args);

    var friend1 = new Friend("no");
    var friend2 = new Friend("han");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
    }
}


class Friend {

    int age = 20;
    String name = "kim";
    Friend(String inname) {
       this.name = inname;
    }
}