package com.nickgroenke;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/application-config.xml" })
public class PlaceholderTest {

    /* Injected with the value from application.properties */
    @Value("${greetName}")
    private String greetName;

    /* Injected from bean definition in application-config.xml */
    @Autowired
    private Placeholder placeholder;

    @Test
    public void testHelloWorld() {
        assertEquals("Hello, " + greetName, placeholder.helloWorld());
    }

}