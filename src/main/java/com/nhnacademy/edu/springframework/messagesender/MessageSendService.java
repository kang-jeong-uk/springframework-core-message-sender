package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


// @Service("messageSendService") // 이름, 클래스네임 : 타입 Component와 동일하게 돌아감
//
@Component("messageSendService")
public class MessageSendService {
    private MessageSender messageSender;
    @Value("${name}")
    private String name;

    public MessageSendService() {

    }
    @Autowired
    public MessageSendService(@Qualifier("emailMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("@nhnacademy.com", "010-1234-5678");
        messageSender.sendMessage(user, "Sending message " + name);
    }

//    @Autowired
//    public void setSmsMessageSender(@SMS("smsMessageSender") MessageSender messageSender) {
//        System.out.println("setSmsMessage");
//        this.messageSender = messageSender;
//    }
//
//    @Autowired
//    public void setEmailMessageSender(@SMS("emailMessageSender") MessageSender messageSender) {
//        System.out.println("setSmsMessage");
//        this.messageSender = messageSender;
//    }





}
