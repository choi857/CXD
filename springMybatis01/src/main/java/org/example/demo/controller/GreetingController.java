package org.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    /*
        private final GreetingService greetingService;

        @Autowired
        public GreetingController(GreetingService greetingService) {
            this.greetingService = greetingService;
        }

    //    @GetMapping("/greet")
    //    public String greet() {
    //        return greetingService.greet();
    //    }
        */
   // public int number;
    @Autowired
    public int num(int number) {

        return number;
    }
}