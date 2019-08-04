package com.BookStoreClient.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TrackingListener {

	@JmsListener(destination="bookstatus.queue")
	public void trackOrder(String message) {
		
		System.out.println("Current Status: "+message);
	}

}
