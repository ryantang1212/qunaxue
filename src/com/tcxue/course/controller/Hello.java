package com.tcxue.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Hello {
 
    @RequestMapping("hello")
    public String hello(){        
        return "index2";
    }
}
