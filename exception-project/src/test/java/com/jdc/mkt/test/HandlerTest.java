package com.jdc.mkt.test;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.handler.Handler;

public class HandlerTest {
	
	@Test
	void testName() {
		Handler handler = new Handler();
		handler.useName();
	}

}
