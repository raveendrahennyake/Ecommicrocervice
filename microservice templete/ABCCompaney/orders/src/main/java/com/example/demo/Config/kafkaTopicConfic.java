package com.example.demo.Config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class kafkaTopicConfic {
    @Value("${spring.kafka.template.default-topic}")
    private String topic_name;
    @Bean
    public NewTopic createTopic (){
        return TopicBuilder.name(topic_name).partitions(1).replicas(1).build();
    }

}
