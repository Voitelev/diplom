package ru.voitelev.application.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan({"ru.voitelev.application.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       // registry.addResourceHandler("/css/**").addResourceLocations("/sources/css/");
        //registry.addResourceHandler("/image/**").addResourceLocations("/sources/image/");
        registry.addResourceHandler("/js/**").addResourceLocations("/src/main/resources/templates/js");
    }
}
