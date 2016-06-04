package javatest.model;

/**
 * Created by samohvalov_dv on 04.06.2016.
 */
public class Message {
    private String messageInfo;

    public Message(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
}
