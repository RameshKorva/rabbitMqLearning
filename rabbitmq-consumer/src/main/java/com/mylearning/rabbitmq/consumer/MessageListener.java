package com.mylearning.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener(CustomMessage customMessage) {
        System.out.println(customMessage);
    }

}
