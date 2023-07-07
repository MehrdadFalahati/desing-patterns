package com.mehrdad.falahati.design.patterns.strategy;

public class EmailProvider implements Provider {
    @Override
    public String send(String message, String emailAddress) {
        return "Send Email to email address: "
                + emailAddress
                + " with message: "
                + message;
    }
}
