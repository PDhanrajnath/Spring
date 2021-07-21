package com.spring.Annotations_and_Autowiring.Qualifiers_for_Dependency_Injection;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
