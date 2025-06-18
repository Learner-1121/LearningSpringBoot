package com.yamsaika.learnspringboot;

import com.yamsaika.learnspringboot.Entity.Order;
import com.yamsaika.learnspringboot.Entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {
    @Mock
    private Order orderMockObj;

    @InjectMocks
    private User user;

    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void assertOrderInitialization()
    {

        assertNotNull(user.order);
    }
}
