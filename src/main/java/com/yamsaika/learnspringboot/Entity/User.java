package com.yamsaika.learnspringboot.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    public Order order;
    public User()
    {
        System.out.println("user initialized");
    }
}
