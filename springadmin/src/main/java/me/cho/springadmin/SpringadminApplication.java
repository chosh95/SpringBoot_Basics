package me.cho.springadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringadminApplication.class, args);
    }

}
