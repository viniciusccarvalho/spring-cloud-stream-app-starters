package org.springframework.cloud.stream.app.cq.gemfire.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CqGemfireSourceRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqGemfireSourceRabbitApplication.class, args);
	}
}
