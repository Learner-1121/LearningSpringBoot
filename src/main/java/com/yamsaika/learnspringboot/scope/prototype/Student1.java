package com.yamsaika.learnspringboot.scope.prototype;

import org.springframework.stereotype.Component;

@Component
public class Student1 {
    public Student1()
    {
        System.out.println("Prototype Student Initialization: "+this.hashCode());
    }
}
