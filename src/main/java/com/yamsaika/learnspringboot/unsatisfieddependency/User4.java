package com.yamsaika.learnspringboot.unsatisfieddependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User4 {
   // @Qualifier("onlineOrder")
    @Autowired
    Order6 order;
    public User4()
    {
        System.out.println("User4: initialized...");
    }
}
