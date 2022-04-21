package com.company;

public class SmsNotificationHandler extends AbstractHandler {

    public SmsNotificationHandler(NotificationType messageType) {
        this.messageType = messageType;
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("Trimiterea mesajului prin SMS: " + message);
    }
}