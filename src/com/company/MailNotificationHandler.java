package com.company;

public class MailNotificationHandler extends AbstractHandler {

    public MailNotificationHandler(NotificationType messageType) {
        this.messageType = messageType;
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("Trimiterea mesajului prin mail: " + message);
    }
}