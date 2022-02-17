package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//載入spring配置檔案
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//檢索自spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//使用bean呼叫方法
		System.out.println(theCoach.getDailyWorkout());
		
		//開始呼叫新方法fortune
		System.out.println(theCoach.getDailyFortune());
		
		//關閉context
		context.close();
	}

}
