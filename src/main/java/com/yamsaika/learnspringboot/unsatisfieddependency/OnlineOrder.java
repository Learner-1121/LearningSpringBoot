package com.yamsaika.learnspringboot.unsatisfieddependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("onlineOrder")
public class OnlineOrder implements Order6{
    public OnlineOrder()
    {
        System.out.println("Online order: initialized");
    }
}
