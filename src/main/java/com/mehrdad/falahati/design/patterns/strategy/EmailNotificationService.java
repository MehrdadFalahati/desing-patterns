package com.mehrdad.falahati.design.patterns.strategy;

public class EmailNotificationService extends NotificationService {
    public EmailNotificationService(User user) {
        super(new EmailProvider(), user);
    }

    @Override
    protected String endPointOfUser() {
        return user.email();
    }
}
