package com.selin.Bebka_Spring.model;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    public String printMessage(){
        return "MessagePrinter sınıfı";
    }
}
