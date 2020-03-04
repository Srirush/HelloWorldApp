package com.greet.helloworldapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateIntegers {

    public List<Integer> removeDuplicateIntegers(int [] inputArray) {
        Arrays.sort(inputArray);
        List<Integer> numbersList = Arrays.stream(inputArray)
                .boxed()
                .collect(Collectors.toList());
       return numbersList.stream().distinct().collect(Collectors.toList());

    }
}
