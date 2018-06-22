package com.vic.chat.sbm.domain;

import java.util.Date;

public class Message {
    private int messageId;
    private int messageFrom;
    private int messageTo;
    private String messageInfo;
    private Date messageTime;
    private String messageStatus;

    public Message(int messageId, int messageFrom, int messageTo, String messageInfo, String messageStatus) {
        this.messageId = messageId;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageInfo = messageInfo;
        this.messageStatus = messageStatus;
    }

    public Message(int messageFrom, int messageTo, String messageInfo) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageInfo = messageInfo;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(int messageFrom) {
        this.messageFrom = messageFrom;
    }

    public int getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(int messageTo) {
        this.messageTo = messageTo;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
}
