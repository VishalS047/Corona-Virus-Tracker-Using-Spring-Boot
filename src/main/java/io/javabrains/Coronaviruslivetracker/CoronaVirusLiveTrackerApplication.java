package io.javabrains.Coronaviruslivetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirusLiveTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusLiveTrackerApplication.class, args);
		System.out.println("Hello");
	}

}
