package org.example.demo.service;

import org.springframework.stereotype.Service;



//实现类
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        return "Hello, World!";
    }
}