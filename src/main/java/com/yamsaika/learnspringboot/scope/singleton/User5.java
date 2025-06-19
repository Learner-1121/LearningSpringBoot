package com.yamsaika.learnspringboot.scope.singleton;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User5 {
    public User5()
    {
        System.out.println("Singleton User initialized: "+this.hashCode());
    }
}
