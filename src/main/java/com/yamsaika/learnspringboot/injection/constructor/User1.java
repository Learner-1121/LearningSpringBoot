package com.yamsaika.learnspringboot.injection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User1 {
    public Order1 order;
    @Autowired
    public User1(Order1 order)
    {
        System.out.println("Constructor injection: user initialized");
        this.order = order;
    }
}
