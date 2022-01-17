package com.amdocs.java.dependencyinjection.injector;

import com.amdocs.java.dependencyinjection.consumer.Consumer;
import com.amdocs.java.dependencyinjection.consumer.MyDIApplication;
import com.amdocs.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
