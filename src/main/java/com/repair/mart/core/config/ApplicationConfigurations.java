package com.repair.mart.core.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.repair.mart.core.dao.api.RamDaoApi;
import com.repair.mart.core.dao.impl.RamDaoImpl;
import com.repair.mart.core.service.api.RamServiceApi;
import com.repair.mart.core.service.impl.RamServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.repair.mart.core"})
public class ApplicationConfigurations implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false));
        converters.add(converter);
    }

    @Bean("com.repair.mart.core.dao.impl.RamDaoImpl")
    public RamDaoApi ramDao(){
        return new RamDaoImpl();
    }

    @Bean("com.repair.mart.core.service.impl.RamServiceImpl")
    public RamServiceApi ramService(){
        return new RamServiceImpl();
    }
}

