package com.yamsaika.learnspringboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class Invoice2 {
    @Lazy
    @Autowired
    public Order5 order;
}
