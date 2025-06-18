package com.yamsaika.learnspringboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderInvoice {
    @Autowired
    public Order4 order;
    @Autowired
    public Invoice invoice;
}
