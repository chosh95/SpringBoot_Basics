package me.cho.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    ChoProperties choProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=========================");
        System.out.println(choProperties.getFullName());
        System.out.println(choProperties.getAge());
        System.out.println("=========================");
    }
}
