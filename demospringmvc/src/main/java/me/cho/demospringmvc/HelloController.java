package me.cho.demospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello123")
    public String hello(){
        return "hello.html";
    }
}
