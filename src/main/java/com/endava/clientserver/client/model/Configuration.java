package com.endava.clientserver.client.model;

import com.endava.clientserver.client.model.Model;
import org.springframework.context.annotation.Bean;

public class Configuration {

    @Bean(name = "model")
    public Model model() {
        return new Model();
    }

}
