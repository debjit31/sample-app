package com.example.hello_app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        String ipAddress = InetAddress.getLocalHost().getHostAddress();
        //log.info("Hello from {}", ipAddress);
        return "Hello World " + "from " + ipAddress;
    }
}
