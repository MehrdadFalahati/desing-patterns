package com.mehrdad.falahati.design.patterns.strategy;

public abstract class NotificationService {
    private final Provider provider;
    protected final User user;

    public NotificationService(Provider provider, User user) {
        this.provider = provider;
        this.user = user;
    }

    public String sendMessage(String message) {
        return provider.send(message, endPointOfUser());
    }

    protected abstract String endPointOfUser();
}
