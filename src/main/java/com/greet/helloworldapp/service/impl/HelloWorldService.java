package com.greet.helloworldapp.service.impl;

import com.greet.helloworldapp.dto.HelloWorldResponseDto;
import com.greet.helloworldapp.service.IHelloWorldService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class HelloWorldService implements IHelloWorldService {

    @Override
    public HelloWorldResponseDto reverseString(String strValue)
    {
        HelloWorldResponseDto helloWorldResponseDto = new HelloWorldResponseDto();
        String[] string = strValue.split(" ");
        String result = "";
        for (int i =string.length-1;i>=0;i--)
        {
           if(StringUtils.isEmpty(result))
               result = string[i];
           else
               result = result + " " + string[i];
        }
        helloWorldResponseDto.setReversed(result);
        return  helloWorldResponseDto;
    }
}
