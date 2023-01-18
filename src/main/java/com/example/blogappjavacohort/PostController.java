package com.example.blogappjavacohort;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    //View exercise 1
    @RequestMapping(path="/roll/dice", method = RequestMethod.GET)
    public  String roll(Model model){
        ArrayList<Integer> ids = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int id = i + 1;
            ids.add(id);
        }
        model.addAttribute("id", ids);
        return "button";
    }

    @PostMapping(path="/roll/dice")
    String id(@RequestParam(name = "id") String idd, Model model ) throws Exception{
        System.out.println(idd);
        model.addAttribute("id", idd);
        System.out.println(idd);
        return "redirect:/roll/" + idd;
    }

    @RequestMapping(path = "/roll/{n}", method = RequestMethod.GET)
    String ret(@PathVariable String n, Model model ) {
        int rando = (int) Math.floor(Math.random() * 6 + 1);
        boolean check = String.valueOf(rando).equals(n);
        if (check) {
            model.addAttribute("check", check);
        } else model.addAttribute("check", check);
        model.addAttribute("id", String.valueOf(rando));
        model.addAttribute("n", n);
        return "check";
    }

}
