package com.mylearning.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage customMessage) {
           customMessage.setMessageId(UUID.randomUUID().toString());
           customMessage.setMessageDate(new Date());
           template.convertAndSend(MQConfig.MESSAGE_EXCHAGE, MQConfig.MESSAGE_ROUTING_KEY, customMessage);
           return "Message published!";
    }
}
