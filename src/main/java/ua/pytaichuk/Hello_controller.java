package ua.pytaichuk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello_controller {
    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}
