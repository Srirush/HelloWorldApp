package com.greet.helloworldapp;


import com.greet.helloworldapp.controller.RemoveDuplicateIntegers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
public class RemoveDuplicateIntegersTest extends HelloWorldAppApplicationTests {

    @Test
    public void removeDuplicateIntegers() {
        RemoveDuplicateIntegers removeDuplicateIntegers = new RemoveDuplicateIntegers();
        int[] inputArray = new int[]{45, 43, 53, 21, 43, 53, 45};
        List<Integer> listWithoutDuplicates =  removeDuplicateIntegers.removeDuplicateIntegers(inputArray);
        List<String> expected = Arrays.asList("21", "43", "45", "53");
        Assertions.assertEquals(expected.contains("21"), listWithoutDuplicates.contains(21));
        Assertions.assertEquals(expected.contains("43"), listWithoutDuplicates.contains(43));
        Assertions.assertEquals(expected.contains("45"), listWithoutDuplicates.contains(45));
        Assertions.assertEquals(expected.contains("53"), listWithoutDuplicates.contains(53));
    }
}