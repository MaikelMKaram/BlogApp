package com.example.blogappjavacohort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String hello() {
        return "This is the index page!";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String viewPostbyID(@PathVariable int id) {
        return "This will view an individual post";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createForm () {
        return "This is the form to  create posts";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postForm () {
        return "Upload created posts";
    }

}
