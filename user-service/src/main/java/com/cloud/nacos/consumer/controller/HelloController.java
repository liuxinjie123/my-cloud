package com.cloud.nacos.consumer.controller;

import com.cloud.nacos.consumer.feign.OrderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试 feign 调用，
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @Resource
    private OrderFeignClient helloFeignClient;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return helloFeignClient.hello(name);
    }


}
