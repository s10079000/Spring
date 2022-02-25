package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
	//新增新的emailAddress核team變數
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CrickertCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CrickertCoach: inside setter method - setTeam");
		this.team = team;
	}

	
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
