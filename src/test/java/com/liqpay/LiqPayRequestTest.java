package com.liqpay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LiqPayRequestTest {

    @Test
    public void testGetProxyUser() {
        assertEquals("dXNlcjpwYXNz", LiqPayRequest.getProxyUser("user", "pass"));
    }
}