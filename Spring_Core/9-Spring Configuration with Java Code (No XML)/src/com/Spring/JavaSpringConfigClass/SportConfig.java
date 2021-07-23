package com.Spring.JavaSpringConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//config class
//@ComponentScan("com.Spring.JavaSpringConfigClass")
public class SportConfig {

    //define a bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for our swim coach and inject dependency
	@Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
