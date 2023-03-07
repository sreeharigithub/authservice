package com.example.authservice;

import com.example.authservice.annotations.ConfiguredPort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class AuthserviceApplicationTests {

	@ConfiguredPort
	private int port;
	@Autowired
	private TestRestTemplate testRestTemplate;
	@Test
	void contextLoads() {
	}

	@Test
	void checkHTTPResponse() throws Exception {
		System.out.printf("port:"+port);
		org.assertj.core.api.Assertions.assertThat(testRestTemplate.getForObject("http://localhost:"+port+"/hello",String.class))
				.contains("Hello");
	}

}
