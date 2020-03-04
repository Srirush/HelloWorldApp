package com.greet.helloworldapp.service;

import com.greet.helloworldapp.dto.HelloWorldResponseDto;
import org.springframework.stereotype.Component;

@Component
public interface IHelloWorldService {

    HelloWorldResponseDto reverseString(String strValue);
}
