package com.company;

public class EmailNotificationHandler extends AbstractHandler {

    public EmailNotificationHandler(NotificationType messageType) {
        this.messageType = messageType;
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("Se trimite mesaj prin e-mail: " + message);
    }
}
