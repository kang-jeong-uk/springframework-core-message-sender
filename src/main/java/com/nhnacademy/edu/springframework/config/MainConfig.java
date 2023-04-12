package com.nhnacademy.edu.springframework.config;


import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
@PropertySource("classpath:name.properties")
//@ImportResource("beans.xml")
public class MainConfig {
//
//    MessageSenderConfig messageSenderConfig;
//    MessageSender messageSender;
//
//    public MainConfig(MessageSenderConfig messageSenderConfig) {
//        this.messageSenderConfig = messageSenderConfig;
//
//    }
//
//    @Bean
//    public MessageSendService messageSendService() {
//        return new MessageSendService(messageSender);
//    }
}
