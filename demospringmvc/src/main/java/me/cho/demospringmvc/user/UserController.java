package me.cho.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController // 메소드 반환에 @Responsebody 생략
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }

}
