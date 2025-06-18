package com.yamsaika.learnspringboot.injection.constructor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order1 {
    public Order1()
    {
        System.out.println("Constructor injection: order initialized");
    }
}
