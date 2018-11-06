package com.example.SimpleRabbitmqProducer;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessageService {
    public Message add(Message msg) throws JsonProcessingException;
}
