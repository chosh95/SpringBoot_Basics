package me.cho.springactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringactuatorApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringactuatorApplication.class, args);
    }

}
