package org.example;

import java.util.Arrays;

public class Exercise2 {
    public static int getMax(int[] numbers) {
        int n = numbers.length;
        int max = numbers[0];

        for(int index = 1; index < n; ++index) {
            if(numbers[index] > max) {
                max = numbers[index];
            }
        }

        return max;
    }

    public static int getMin(int[] numbers) {
        int n = numbers.length;
        int min = numbers[0];

        for(int index = 1; index < n; ++index) {
            if(numbers[index] < min) {
                min = numbers[index];
            }
        }

        return min;
    }

    public int getMaxSum(int[] numbers) {
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        int min = this.getMin(numbers);

        return sum - min;
    }

    public int getMinSum(int[] numbers) {
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        int max = this.getMax(numbers);

        return sum - max;
    }
}
