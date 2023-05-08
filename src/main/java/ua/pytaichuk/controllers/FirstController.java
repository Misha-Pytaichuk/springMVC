package ua.pytaichuk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){


        model.addAttribute("message", name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") Double a,
                             @RequestParam("b") Double b,
                             @RequestParam("action") String action,
                             Model model){
        double res = 0.0;

        switch (action){
            case "multi":
                res = a*b;
                break;
            case "add":
                res = a+b;
                break;
            case "sub":
                res = a-b;
                break;
            case "div":
                res = a/b;
                break;
        }

        model.addAttribute("result", res);
        model.addAttribute("action", action);

        return "first/calculator";
    }
}
