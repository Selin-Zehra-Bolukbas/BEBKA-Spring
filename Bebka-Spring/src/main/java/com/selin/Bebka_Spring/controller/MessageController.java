package com.selin.Bebka_Spring.controller;

import com.selin.Bebka_Spring.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public String message(){
        return messageService.printMessage();
    }
}
