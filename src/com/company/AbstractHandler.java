package com.company;

public abstract class AbstractHandler {
    protected NotificationType messageType;

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void sendNotification(NotificationType messageType, String message){
        if(this.messageType == messageType){
            sendMessage(message);
            return;
        }
        if(nextHandler !=null){
            System.out.println("Se trimite mesajul următorului handler");
            nextHandler.sendNotification(messageType, message);
        }
    }
    abstract void sendMessage(String message);
}