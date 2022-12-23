package com.cobo.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

public class RestTemplateContext {

    @Bean
    @Qualifier("whateverRestTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
