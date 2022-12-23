package com.cobo.component;

import org.springframework.web.client.RestTemplate;

import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class RestTemplateContext {

    @Produces
    @Named("whateverRestTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
