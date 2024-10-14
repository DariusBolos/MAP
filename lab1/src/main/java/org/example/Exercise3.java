package org.example;

import java.util.Arrays;

public class Exercise3 {
    private int[] number1;
    private int[] number2;

    public Exercise3(int[] number1, int[] number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int[] getSum() {
        int[] result = new int[number1.length + 1];
        int carry = 0;

        for (int i = number1.length - 1; i >= 0; i--) {
            int sum = number1[i] + number2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    public int[] getDifference() {
        int[] result = new int[number1.length];
        int borrow = 0;

        for (int i = number1.length - 1; i >= 0; i--) {
            int diff = number1[i] - number2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        return result;
    }

    public int[] getMultiplication(int digit) {
        int[] result = new int[number1.length + 1];
        int carry = 0;

        for (int i = number1.length - 1; i >= 0; i--) {
            int product = number1[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    public int[] getDivision(int digit) {
        int[] result = new int[number1.length];
        int carry = 0;

        for (int i = 0; i < number1.length; i++) {
            int current = carry * 10 + number1[i];
            result[i] = current / digit;
            carry = current % digit;
        }

        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }
}