package com.rainyday.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	/*@Value("${server.port}")
	private void port(String port) {
		System.out.println(port);
	}

	@Value("${encrypt.key}")
	private void key(String key) {
		System.out.println(key);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
