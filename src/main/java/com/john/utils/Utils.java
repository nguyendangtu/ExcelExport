package com.john.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Utils {

    private final Random random;

    public Utils() {

        random = new Random();
    }


}
