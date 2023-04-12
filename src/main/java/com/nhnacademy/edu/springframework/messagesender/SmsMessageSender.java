package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    public void init() {
        System.out.println("SMSmessageSender init()-------------------");
    }


    public SmsMessageSender() {
        System.out.println("SmsMessgeSender Initailize");
    }

    public void close() {
        System.out.println("SmsMessageSender Destroy-------------------");
    }
}
