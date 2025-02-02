package com.yowyob.apigateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiGatewayApplicationTests {

	@Test
	void contextLoads() {
		// Vérifie que le contexte Spring se charge correctement
	}

	@Test
	void applicationStarts() {
		ApiGatewayApplication.main(new String[] {});
	}
}