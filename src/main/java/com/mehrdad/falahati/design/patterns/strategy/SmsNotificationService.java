package com.mehrdad.falahati.design.patterns.strategy;

public class SmsNotificationService extends NotificationService {
    public SmsNotificationService(User user) {
        super(new SmsProvider(), user);
    }

    @Override
    protected String endPointOfUser() {
        return user.phoneNumber();
    }
}
