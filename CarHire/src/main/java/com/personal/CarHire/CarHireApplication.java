package com.personal.CarHire;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarHireApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarHireApplication.class, args);
	}
         @Bean
        public CommandLineRunner cmdRn(ApplicationContext ctx){
            return args->{
                System.out.print("Inspecting Provided Beans");
                
                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for(String beanName : beanNames){
                    System.out.print(beanName+"\n");
                }
            };
        }
}
