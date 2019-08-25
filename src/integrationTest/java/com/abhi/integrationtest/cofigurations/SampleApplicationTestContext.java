package com.abhi.integrationtest.cofigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import com.abhi.cucspring.sample.SampleApplication;

@ContextConfiguration
@SpringBootTest(classes = { SampleApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleApplicationTestContext {

	@Autowired
	public TestRestTemplate testRestTemplate;
	
	@LocalServerPort
	public int serverPort;
	
}
