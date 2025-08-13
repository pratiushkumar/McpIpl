package com.patty.schedule_ipl;

import com.patty.schedule_ipl.service.ScheduleService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScheduleIplApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleIplApplication.class, args);

	}
	@Bean
	public ToolCallbackProvider weatherTools(ScheduleService scheduleService) {
		return MethodToolCallbackProvider.builder().toolObjects(scheduleService).build();
	}
}
