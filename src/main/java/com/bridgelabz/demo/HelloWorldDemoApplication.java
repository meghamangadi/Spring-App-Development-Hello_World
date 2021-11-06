package com.bridgelabz.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.demo.component.DemoBean;
import com.bridgelabz.demo.controller.HelloRestController;

@SpringBootApplication
public class HelloWorldDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloWorldDemoApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello from BridgeLabz");
		ApplicationContext context = SpringApplication.run(HelloWorldDemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
	}

}
