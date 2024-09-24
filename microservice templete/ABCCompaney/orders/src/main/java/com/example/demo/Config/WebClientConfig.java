package com.example.demo.Config;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
@Configuration
public class WebClientConfig {
    @Bean
    @LoadBalanced
    public WebClient.Builder WebClientBuilder (){
        return WebClient.builder();
    }
    @Bean
    @Qualifier("inventoryWebClient")
    public WebClient inventoryWebClient (){
        return WebClientBuilder().baseUrl("http://inventory/api/v1").build();
    }
    @Bean
    @Qualifier("ProductWebClient")
    public WebClient ProductWebClient (){
        return WebClientBuilder().baseUrl("http://product/api/v1").build();
    }
}
