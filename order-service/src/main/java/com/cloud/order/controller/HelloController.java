package com.cloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试使用， HelloController
 */
@RequestMapping(value = "/hello/")
@RestController
public class HelloController {
    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String serverName;

    @GetMapping(value = "hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name + ", i am from port: " + serverPort + ". \t\t" + serverName;
    }
}
