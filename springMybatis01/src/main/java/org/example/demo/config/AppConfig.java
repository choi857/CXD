

package org.example.demo.config;


import org.example.demo.service.GreetingService;
import org.example.demo.service.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.demo")
public class AppConfig {
    // 在这里添加bean的定义


    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
    @Bean
    public int Number() {

        return 10;
    }


}