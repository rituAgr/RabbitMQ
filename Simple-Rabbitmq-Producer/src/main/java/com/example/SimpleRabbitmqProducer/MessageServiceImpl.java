package com.example.SimpleRabbitmqProducer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${app.notification.queue.name}")
    private String queueName;

    @Override
    public Message add(Message msg) throws JsonProcessingException {
        rabbitTemplate.convertAndSend(queueName, msg);
        System.out.println("Message = " + msg.getMsg());
        return msg;
    }
}
