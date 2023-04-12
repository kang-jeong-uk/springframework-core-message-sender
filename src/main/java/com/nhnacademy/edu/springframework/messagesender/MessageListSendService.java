package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageListSendService {
    private final List<MessageSender> listSender;

    @Autowired
    public MessageListSendService(List<MessageSender> listSender) {
        this.listSender = listSender;
    }

    public void printList() {
        User user = new User("@nhnacademy.com", "010-1234-5678");
        listSender.stream().forEach(l -> l.sendMessage(user, user.getEmail()));
    }
}
