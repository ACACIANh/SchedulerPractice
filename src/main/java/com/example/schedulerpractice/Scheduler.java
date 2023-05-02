package com.example.schedulerpractice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	@Scheduled( fixedDelay = 1000 )         // scheduler 끝나는 시간 기준으로 1000 간격으로 실행
	public void scheduleFixedDelayTask() {
		System.out.println( "Fixed delay task - " + System.currentTimeMillis() / 1000 );
	}

	@Scheduled( fixedRate = 1000 )          // scheduler 시작하는 시간 기준으로 1000 간격으로 실행
	public void scheduleFixedRateTask() {
		System.out.println( "Fixed rate task - " + System.currentTimeMillis() / 1000 );
	}

	@Scheduled( cron = "0 15 10 15 * ?" )   // cron에 따라 실행 // 매월 15일 10시 15분에 동작
//	@Scheduled( cron = "0 15 10 15 * ?", zone = "Europe/Paris" )    // TimeZone 설정 추가 가능
	public void scheduleTaskUsingCronExpression() {
		long now = System.currentTimeMillis() / 1000;
		System.out.println( "schedule tasks using cron jobs - " + now );
	}
}
