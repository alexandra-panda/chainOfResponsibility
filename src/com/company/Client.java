package com.company;

public class Client {
    public static void main(String[] args) {
        NotificationHandlerChain handlerChain = new NotificationHandlerChain();

        handlerChain.sendNotification(NotificationType.SMS, "Buna");

        handlerChain.sendNotification(NotificationType.EMAIL, "Buna");

        handlerChain.sendNotification(NotificationType.MAIL, "Buna");
    }
}