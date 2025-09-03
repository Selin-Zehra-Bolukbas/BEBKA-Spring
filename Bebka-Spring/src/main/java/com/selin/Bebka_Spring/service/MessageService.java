package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.MessagePrinter;
import com.selin.Bebka_Spring.service.impl.MessageServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MessageService implements MessageServiceImpl {

    private final MessagePrinter messagePrinter;

    public MessageService(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }


    public String printMessage() {
      return  messagePrinter.printMessage();
    }

}
