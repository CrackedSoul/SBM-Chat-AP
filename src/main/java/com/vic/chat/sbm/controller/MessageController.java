package com.vic.chat.sbm.controller;

import com.vic.chat.sbm.domain.Message;
import com.vic.chat.sbm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    @PostMapping(value = "/addMessage")
    public void addMessage(@RequestBody Message message) {
        messageService.addMessage(message);
    }
    @GetMapping(value = "/getAllMessage/{idTo}")
    public List<Message> getAllMessage(@PathVariable int idTo) {
        return  messageService.receiveAll(idTo);
    }
    @GetMapping(value = "/getMessageFrom/{idFrom}/{idTo}")
    public List<Message> getAllUser(@PathVariable int idFrom,@PathVariable int idTo) {
        return  messageService.receiveFrom(idFrom, idTo);
    }
}