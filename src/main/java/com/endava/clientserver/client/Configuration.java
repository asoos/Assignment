package com.endava.clientserver.client;

import org.springframework.context.annotation.Bean;

public class Configuration {

    @Bean(name = "model")
    public Model model() {
        return new Model();
    }

}
