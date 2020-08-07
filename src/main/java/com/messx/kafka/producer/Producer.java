package com.messx.kafka.producer;


import com.messx.kafka.dto.UserRequest;
import com.messx.kafka.model.User;
import com.messx.kafka.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("kafka")
public class Producer {
   private final UserService userService;
   private final KafkaTemplate<String, User> kafkaTemplate;
   private final String topic = "Kafka_Example";
   @PostMapping("/publish")
   public String publish(@RequestBody UserRequest postDto){
      User user=userService.create(postDto);
      log.info("user:"+user);
      kafkaTemplate.send(topic, user);
      return "created";
   }
}
