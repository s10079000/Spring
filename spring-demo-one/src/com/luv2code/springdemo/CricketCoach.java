package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
	//建立一個無參數建構子
	public CricketCoach() {
		System.out.println("CrickertCoach: inside no-arg constructor");
	}
	
	//準備利用spring 依賴注入用
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CrickertCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
