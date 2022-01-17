package com.amdocs.java.dependencyinjection.injector;

import com.amdocs.java.dependencyinjection.consumer.Consumer;
import com.amdocs.java.dependencyinjection.consumer.MyDIApplication;
import com.amdocs.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
