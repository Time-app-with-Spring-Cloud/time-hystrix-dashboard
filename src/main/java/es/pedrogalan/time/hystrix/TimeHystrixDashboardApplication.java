package es.pedrogalan.time.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class TimeHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeHystrixDashboardApplication.class, args);
	}

}
