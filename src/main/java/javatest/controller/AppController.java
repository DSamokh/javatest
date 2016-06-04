package javatest.controller;

import javatest.model.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
    @Autowired
    MessageService message;

    @RequestMapping("/")
    public String shrink(Model model){
        model.addAttribute("hello", message.getMessageInfo());
        return "hello";
    }

}
