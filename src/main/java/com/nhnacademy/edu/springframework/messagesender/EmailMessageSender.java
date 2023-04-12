package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EmailMessageSender implements MessageSender{

    public EmailMessageSender() {
        System.out.println("EmailMessageSender Initailize");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }

    @PostConstruct
    public void init() {
        System.out.println("EmailMessageSender init()-------------------");
    }


    @PreDestroy
    public void shutdown() {
        System.out.println("EmailMessageSender Destroy-------------------");
    }
}
