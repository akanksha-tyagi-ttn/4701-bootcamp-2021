package com.springbootstart.spring1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring1Application.class, args);
		System.out.println("--------------------------------------------------");
		JourneyClass obj= context.getBean(JourneyClass.class);
		obj.startJourney();
		System.out.println("--------------------------------------------------");
	}
}


//System.out.println(context.getEnvironment().getProperty("obj.getAbc()"));