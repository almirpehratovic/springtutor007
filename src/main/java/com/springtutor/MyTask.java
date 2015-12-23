package com.springtutor;

import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class MyTask {
	public void updateDatabase(){
		Date now = new Date();
		System.out.println("Updating database... " + now);
		
	}
	
	@Scheduled(cron="0 0 9-17 * * MON-FRI")
	public void sendEmails(){
		Date now = new Date();
		System.out.println("Sending emails... " + now);
	}
	
	@Scheduled(fixedRate=120000)
	@Async
	public void deleteTrash(){
		Date now = new Date();
		System.out.println("Deleting trash... " + now);
		try {
			Thread.sleep(5*60000);
		} catch (InterruptedException e){
			
		}
	}
}
