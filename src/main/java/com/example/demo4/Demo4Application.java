package com.example.demo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo4Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person p= (Person)context.getBean("person");

		Addition a=(Addition)context.getBean("add");
		System.out.println(a);

		System.out.println(p);

	}

}
