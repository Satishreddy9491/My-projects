package com.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppDto {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(AppDto.class);

	public static void main(String[] args) throws Exception {
		new AppDto().proceed();
	}

	public void proceed() {
		LOGGER.info("Hello World!");
	}
}
