package com.yamsaika.learnspringboot.injection.setter;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order3 {
    public Order3()
    {
        System.out.println("Setter Injection: Order initialized ...");
    }
}
