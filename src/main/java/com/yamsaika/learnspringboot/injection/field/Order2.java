package com.yamsaika.learnspringboot.injection.field;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order2 {
    public Order2()
    {
        System.out.println("Field Injection: order initialized...");
    }
}
