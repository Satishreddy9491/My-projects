package com.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppSampleWebJspApplication {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(AppSampleWebJspApplication.class);

	public static void main(String[] args) throws Exception {
		new AppSampleWebJspApplication().proceed();
	}

	public void proceed() {
		LOGGER.info("Hello World!");
	}
}
