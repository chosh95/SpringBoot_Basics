package me.cho.springjpa;

import me.cho.springjpa.account.Account;
import me.cho.springjpa.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringjpaApplication.class, args);
    }

}
