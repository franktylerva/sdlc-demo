package com.example.sdlcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SdlcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdlcDemoApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello World!  Testing another update.";
	}
}
