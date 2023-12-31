package com.rajesh.kafkalearning.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messages")
public class KafkaResource {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/publish")
    public void publish(@RequestBody String body) {
        kafkaTemplate.send("rajeshstarter", body);

    }

    //    @GetMapping("/consume")
    //    public void consume() {
    //        //  return kafkaListener.listen()
    //    }
}
