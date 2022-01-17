package com.amdocs.java.dependencyinjection.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amdocs.java.dependencyinjection.consumer.Consumer;
import com.amdocs.java.dependencyinjection.consumer.MyDIApplication;
import com.amdocs.java.dependencyinjection.injector.MessageServiceInjector;
import com.amdocs.java.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;
	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				//mock the message service
				return new MyDIApplication(new MessageService() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

}
