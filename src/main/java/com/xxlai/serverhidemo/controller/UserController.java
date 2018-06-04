package com.xxlai.serverhidemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	private static final Logger LOG = LoggerFactory
			.getLogger(UserController.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String callHome() {
		LOG.info("calling trace user-service ");
		return restTemplate.getForObject("http://localhost:8681/miya",
				String.class);
	}

	@RequestMapping("/info")
    public String info(){
        LOG.info("calling trace user-service ");
        return "i'm user-service";

    }

}
