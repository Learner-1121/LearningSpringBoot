package com.yamsaika.learnspringboot.injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User2 {
    @Autowired
    public Order2 order;
    public User2()
    {
        System.out.println("Field Injection: user initialized");
    }
}
