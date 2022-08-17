package kz.spring.boot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaStringTopics(){
        return TopicBuilder.name("kafka-example").build();
    }

    @Bean
    public NewTopic kafkaJsonTopics(){
        return TopicBuilder.name("kafka-json").build();
    }
}
