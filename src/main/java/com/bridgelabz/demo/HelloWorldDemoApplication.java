package com.bridgelabz.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.bridgelabz.demo.component.DemoBean;
import com.bridgelabz.demo.component.EmployeeBean;


@SpringBootApplication
public class HelloWorldDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(HelloWorldDemoApplication.class);

	public static void main(String[] args) {
		logger.debug("Hello from BridgeLabz");
		logger.debug("hello");
		logger.info("demo");
		logger.error("error");
		logger.warn("warning");
		ApplicationContext context = SpringApplication.run(HelloWorldDemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		 logger.info("\n*** Example using @Autowire annotation on property***");
		    
			logger.warn("warning");
			logger.info("Demo Bean {} " , demoBean.toString());  
	        logger.info("\n*** Example using @Autowire annotation on property***");
	        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
	        employeeBean.seteId(100);
	        employeeBean.seteName("megha");
	        employeeBean.showEmployeeDetails();
       
	}

}
