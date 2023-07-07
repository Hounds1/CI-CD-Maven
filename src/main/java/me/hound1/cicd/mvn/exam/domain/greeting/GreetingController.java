package me.hound1.cicd.mvn.exam.domain.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "/hello";
    }
}
