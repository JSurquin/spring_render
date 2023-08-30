package com.example.render.demo.render;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoRenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRenderApplication.class, args);
	}

}

@RestController
class DemoRenderController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
