package com.example.schedulerpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SchedulerPracticeApplication {

	public static void main( String[] args ) {
		SpringApplication.run( SchedulerPracticeApplication.class, args );
	}

}
