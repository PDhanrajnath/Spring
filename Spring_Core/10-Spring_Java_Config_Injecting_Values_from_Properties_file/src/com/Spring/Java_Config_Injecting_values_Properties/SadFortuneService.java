package com.Spring.Java_Config_Injecting_values_Properties;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
