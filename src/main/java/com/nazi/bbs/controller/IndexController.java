package com.nazi.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;



@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        System.out.println("exe");
        return new ModelAndView("home/index");
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }
}
