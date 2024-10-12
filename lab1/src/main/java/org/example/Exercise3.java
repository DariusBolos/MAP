package org.example;

public class Exercise3 {
    public int[] getSum(int[] number1, int[] number2) {
        int[] sum = new int[11];
        int carry = 0;
        for (int i = 8; i >= 0; i--) {
            sum[i] = number1[i] + number2[i] + carry;
            if (sum[i] > 9) {
                sum[i] -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        return sum;
    }

    public int[] getDifference(int[] number1, int[] number2) {
        int[] difference = new int[9];
        int borrow = 0;
        for (int i = 8; i >= 0; i--) {
            difference[i] = number1[i] - number2[i] - borrow;
            if (difference[i] < 0) {
                difference[i] += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
        }
        return difference;
    }

    public int[] getProduct(int[] number1, int[] number2) {
        int[] product = new int[9];
        int carry = 0;
        for (int i = 8; i >= 0; i--) {
            product[i] = number1[i] * number2[i] + carry;
            if (product[i] > 9) {
                carry = product[i] / 10;
                product[i] %= 10;
            } else {
                carry = 0;
            }
        }
        return product;
    }

    public int[] getQuotient(int[] number1, int[] number2) {
        int[] quotient = new int[9];
        int remainder = 0;
        for (int i = 0; i < 9; i++) {
            quotient[i] = (number1[i] + remainder * 10) / number2[i];
            remainder = (number1[i] + remainder * 10) % number2[i];
        }
        return quotient;
    }
}
