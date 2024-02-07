package org.example.server8082.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server8082")
public class BaseController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Test Success";
    }
}
