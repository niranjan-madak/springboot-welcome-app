package com.madak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWelcomeAppApplication {

    @GetMapping("/greet")
    public String wlcmMsg() {
        return "Hi Mr. niranjan welcome to your first spring boot app deployment on azure web app from github action !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWelcomeAppApplication.class, args);
    }

}
