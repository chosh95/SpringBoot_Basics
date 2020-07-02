package me.cho.springsecuritycustomize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account cho = accountService.createAccount("cho","1234");
        System.out.println(cho.getUsername() + " " + cho.getPassword());
    }
}
