package com.yourcompany;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        App app = new App();
        assertEquals("Hello, Maven!", app.getMessage());
    }
}
