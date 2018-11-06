package com.example.SimpleRabbitmqProducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private MessageService msgService;

    public MessageController(MessageService msgService){
        this.msgService = msgService;
    }


    @PostMapping("/")
    public Message add(@RequestBody Message msg) throws JsonProcessingException {
        return  msgService.add(msg);
    }
}


