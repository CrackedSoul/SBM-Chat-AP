package com.vic.chat.sbm.service.impl;


import com.vic.chat.sbm.dao.MessageDao;
import com.vic.chat.sbm.domain.Message;
import com.vic.chat.sbm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService {

    private final MessageDao messageDao;

    @Autowired
    public MessageServiceImpl(MessageDao messageDao) {
        this.messageDao = messageDao;
    }
    @Override
    public List<Message> receiveAll(int idTo) {
        return this.messageDao.selectFromAll(idTo);
    }

    @Override
    public List<Message> receiveFrom(int idFrom, int idTo) {
        return this.messageDao.selectFrom(idFrom, idTo);
    }

    @Override
    public void addMessage(Message message) {
        this.messageDao.insertMessage(message);
    }

    @Override
    public void updateMessage(Message message) {
        this.messageDao.updateMessage(message);
    }

}
