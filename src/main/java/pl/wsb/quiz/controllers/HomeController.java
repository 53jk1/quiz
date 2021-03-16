package pl.wsb.quiz.controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/{id}")
    public String home(@PathVariable int id) {
        return "Wynik" + id;
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam int a, @RequestParam int b) {
        return "Wynik " + (a+b);
    }

}
