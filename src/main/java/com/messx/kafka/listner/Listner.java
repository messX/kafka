package com.messx.kafka.listner;

import com.messx.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Listner {
    @KafkaListener(topics = "Kafka_Example", groupId = "test", containerFactory = "userKafkaListenerContainerFactory")
    public void consume(User user){
        log.debug("recieved log message");
        log.info(String.format("User : %s", user));
    }
}
