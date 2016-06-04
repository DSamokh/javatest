package javatest.model;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private String message;

    public MessageService() {

    }

    public void setMessageInfo(String message) {

        this.message = message;
    }

    public String getMessageInfo() {

        return "hello";
    }
}
