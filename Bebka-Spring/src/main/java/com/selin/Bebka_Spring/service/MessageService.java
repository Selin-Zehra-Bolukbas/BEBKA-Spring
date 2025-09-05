package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.MessagePrinter;
import com.selin.Bebka_Spring.service.impl.MessageServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


public interface MessageService {

    String printMessage();

}
