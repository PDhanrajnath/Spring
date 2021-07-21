package com.spring.Annotations_and_Autowiring.Field_Injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Your LUCKY DAY!";
    }
}
