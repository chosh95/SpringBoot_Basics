package me.cho.mvcthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","cho");
        return "hello";
    }
}
