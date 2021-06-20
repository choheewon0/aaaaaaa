package com.care.root.schedulconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
//@EnableScheduling
public class MyScheduler {
	@Scheduled(cron = "0-59 * * * * *")
	public void testS() {
		System.out.println("매 초 마다 실행 됩니다");
	}
}
