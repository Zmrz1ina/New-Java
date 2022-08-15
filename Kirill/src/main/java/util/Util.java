package util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Util {
    public static double[] generateRandomArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static List<Integer> generateRandomArrayList() {
        return new Random()
                .ints(100, 1, 100)
                .boxed()
                .collect(Collectors.toList());
    }
}

