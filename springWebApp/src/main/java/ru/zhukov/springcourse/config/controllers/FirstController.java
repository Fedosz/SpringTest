package ru.zhukov.springcourse.config.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") int b,
                             @RequestParam("action") String action,
                             Model model) {

        double res;

        switch (action) {
            case "multiplication":
                res = a * b;
                break;
            case "division":
                res = a / (double)b;
                break;
            case "sum":
                res = a + b;
                break;
            case "substraction":
                res = a - b;
                break;
            default:
                res = 0;
                break;
        }

        model.addAttribute("res", res);

        return "first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
