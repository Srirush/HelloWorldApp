package com.greet.helloworldapp.controller;

import com.greet.helloworldapp.dto.HelloWorldResponseDto;
import com.greet.helloworldapp.service.IHelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @Autowired
    private IHelloWorldService helloWorldService;

    @GetMapping("/{strValue}")
    public HelloWorldResponseDto getReverseOfString(@PathVariable String strValue)
    {
       return  helloWorldService.reverseString(strValue);
    }
}
