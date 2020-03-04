package com.greet.helloworldapp;

import com.greet.helloworldapp.dto.HelloWorldResponseDto;
import com.greet.helloworldapp.service.impl.HelloWorldService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldServiceTest  extends HelloWorldAppApplicationTests{

@Autowired
HelloWorldService helloWorldService;

@Test
public void testReverseString()  {
        HelloWorldResponseDto helloWorldResponseDto = helloWorldService.reverseString("hello world");
        Assertions.assertEquals(helloWorldResponseDto.getReversed(), "world hello");
    }
}
