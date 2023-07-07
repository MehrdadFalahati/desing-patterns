package com.mehrdad.falahati.design.patterns.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    private User user;

    @BeforeEach
    void init() {
        user = new User("Ali", "ali@gmail.com", "122445688");
    }

    @Test
    void test_send_sms() {
        var service = new SmsNotificationService(user);
        assertEquals("Send SMS to phone number: 122445688 with message: Hi, it is a test message", service.sendMessage("Hi, it is a test message"));
    }

    @Test
    void test_send_email() {
        var service = new EmailNotificationService(user);
        assertEquals("Send Email to email address: ali@gmail.com with message: Hi, it is a test message", service.sendMessage("Hi, it is a test message"));
    }
}