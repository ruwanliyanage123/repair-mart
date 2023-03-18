package com.repair.mart.core.config;

import com.repair.mart.core.controller.impl.RamRestControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigurations {
    @Bean
    public RamRestControllerImpl ramRestController(){
        return  new RamRestControllerImpl();
    }
}
