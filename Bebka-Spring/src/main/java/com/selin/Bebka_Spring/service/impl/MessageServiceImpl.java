package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.MessagePrinter;
import com.selin.Bebka_Spring.service.MessageService;

public class MessageServiceImpl implements MessageService {


    private final MessagePrinter messagePrinter;

    public MessageServiceImpl(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }
    @Override
    public String printMessage() {
        return  messagePrinter.printMessage();
    }
}
