package com.company;

public class NotificationHandlerChain {
    private AbstractHandler smsHandler;
    private AbstractHandler emailHandler;
    private AbstractHandler mailHandler;

    private AbstractHandler handlerChain;

    public NotificationHandlerChain() {
        smsHandler = new SmsNotificationHandler(NotificationType.SMS);
        emailHandler = new EmailNotificationHandler(NotificationType.EMAIL);
        mailHandler = new MailNotificationHandler(NotificationType.MAIL);

        smsHandler.setNextHandler(emailHandler);
        emailHandler.setNextHandler(mailHandler);

        handlerChain = smsHandler;
    }
    public void sendNotification(NotificationType messageType, String message) {
        handlerChain.sendNotification(messageType, message);
    }
}