package com.manageOrder.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.manageOrder.model.Orders;
       
@Component
public class MessageReceiver
{
	private static final String MESSAGE_QUEUE = "orders_queue";
	private static final String MESSAGE_QUEUE_2 = "orders_queue";
	
	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Orders order)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + order);
	}
	@JmsListener(destination = MESSAGE_QUEUE_2)
	public void receiveMessageFromQueue2(Orders order)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + order);
	}
}
