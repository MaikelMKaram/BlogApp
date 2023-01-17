package com.example.blogappjavacohort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    @ResponseBody
    public String hello() {
        return "This is the landing page!";
    }
}
