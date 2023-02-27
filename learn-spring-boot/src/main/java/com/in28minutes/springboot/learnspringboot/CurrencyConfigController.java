package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("currency-config")
public class CurrencyConfigController {
    CurrencyServiceConfiguration configuration;

    @Autowired
    public CurrencyConfigController(CurrencyServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping
    public CurrencyServiceConfiguration getConfig() {
        return configuration;
    }
}
