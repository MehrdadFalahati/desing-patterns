package com.mehrdad.falahati.design.patterns.strategy;

public class SmsProvider implements Provider {
    @Override
    public String send(String message, String phoneNumber) {
        return "Send SMS to phone number: "
                + phoneNumber
                + " with message: "
                + message;
    }
}
