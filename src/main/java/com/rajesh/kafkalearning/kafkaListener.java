package com.rajesh.kafkalearning;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListener {
    @KafkaListener(topics = "rajeshstarter", groupId = "group-id")
    public  String listen(String message) {
        System.out.println("Received Messasge in group - group-id: " + message);
        return message;
    }
}
