package com.solstice.pairmessageconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "${app.queue-name}")
    public void receive(Message s) {
        System.out.println(s.getId() + s.getMsg());
    }
}
