package com.yamsaika.learnspringboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class Order5 {
    @Lazy
    @Autowired
    public Invoice invoice;
}
