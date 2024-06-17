package com.example.springboot_test_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "First message 1 from AWS Ecs";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Second message from AWS Ecs";
    }

    @GetMapping("/message2")
    public String getMessage2() {
        return "Second message 2 from AWS Ecs";
    }
    
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/test")
    public String testMessage() {
        return "test message for path";
    }

}
