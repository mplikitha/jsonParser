package com.capg.java.json.jackson.jsonParserExample;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.java.json.jackson.jsonParserExample.service.JacksonObjectMapper;

@SpringBootApplication
public class JsonParserExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonParserExampleApplication.class, args);
		
		try {
			JacksonObjectMapper.jsonMapper();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
