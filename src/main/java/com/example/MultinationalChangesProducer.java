package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MultinationalChangesProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MultinationalChangesProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;
    public MultinationalChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(){
        String topic = "Multinational_recentchang";
        //to read real time stream data from multinational, we use event source
    }
}
