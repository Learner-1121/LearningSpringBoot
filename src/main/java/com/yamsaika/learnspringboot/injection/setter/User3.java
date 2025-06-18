package com.yamsaika.learnspringboot.injection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User3 {
    public Order3 order;
    public User3()
    {
        System.out.println("Setter Injection: user initialized ...");
    }
    @Autowired
    public void setOrder(Order3 order)
    {
        this.order = order;
    }
}
