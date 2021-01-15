package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {

    private final String color = System.getenv("APP_COLOR");

    /**
     * 샘플 메인
     * @return
     */
    @GetMapping(value ="/")
    public ModelAndView main(){
        return new ModelAndView(color.equalsIgnoreCase("blue") ? "blue.html" : "green.html");
    }
}
