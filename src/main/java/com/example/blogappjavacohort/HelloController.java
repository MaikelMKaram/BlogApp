package com.example.blogappjavacohort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    //Spring allows us to use path variables, that is, variables that are part of the URI of a request, as opposed to being passed as a query string, or as part of the request body. Here is an example of a method that uses a path variable:
    // whatever string gets passed into the {name} in link will be the name string variable'
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    //If the path variable is not a string, we can define the parameter with a different type.

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

}
