package com.yamsaika.learnspringboot.unsatisfieddependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Lazy
@Qualifier("OfflineOrder")
public class OfflineOrder implements Order6{
    public OfflineOrder()
    {
        System.out.println("Offline Order: initialized");
    }
}
