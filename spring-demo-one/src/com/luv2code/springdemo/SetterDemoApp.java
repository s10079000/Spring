package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//讀取spring設定檔
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//從spring取出bean container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//呼叫bena內的方法
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//關閉context
		context.close();
	}

}
