package com.cloud.nacos.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-service")
public interface OrderFeignClient {

    @GetMapping("/hello/hello")
    String hello(@RequestParam("name") String name);
}
