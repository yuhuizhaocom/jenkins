package com.yuhuizhao.java.springboot.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String demo() {

        return "demo5";
    }

}
