package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//為依賴(dependency)宣告一個私有的屬性
	private FortuneService fortuneService;
	
	//為依賴注入宣告一個建構子
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Speed 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//使用fortuneService取得fortune;
		return fortuneService.getFortune();
	}
}
