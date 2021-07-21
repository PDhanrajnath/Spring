package com.spring.Annotations_and_Autowiring.Qualifiers_for_Dependency_Injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
