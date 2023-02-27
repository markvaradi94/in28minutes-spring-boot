package com.in28minutes.springboot.learnspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "currency-service")
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String key;
}
