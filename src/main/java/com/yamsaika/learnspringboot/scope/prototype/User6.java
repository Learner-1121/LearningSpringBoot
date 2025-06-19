package com.yamsaika.learnspringboot.scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class User6 {
    public User6()
    {
        System.out.println("Prototype: user initialized "+this.hashCode());
    }
}
