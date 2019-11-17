package com.dicoding.picodiploma.mywidgets;

import java.util.Random;

public class NumberGenerator {
    public static int Generate(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
