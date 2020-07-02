package me.cho.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(origins = "http://localhost:18080")
    @GetMapping("/cors")
    public String cors(){
        return "cors";
    }
}
