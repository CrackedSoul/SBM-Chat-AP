package com.vic.chat.sbm.service;

import com.vic.chat.sbm.domain.Message;

import java.util.List;

public interface MessageService {
    List<Message> receiveAll(int idTo);
    List<Message> receiveFrom(int idFrom,int idTo);
    void addMessage(Message message);
    void updateMessage(Message message);
}