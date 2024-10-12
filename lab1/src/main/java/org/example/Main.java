package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        int[] grades = { 29, 37, 38, 41, 84, 67 };
        System.out.println("Insufficient grades: " + Arrays.toString(exercise1.getInsufficientGrades(grades)));
        System.out.println("Average grade: " + exercise1.getAverageGrade(grades));
        System.out.println("Rounded grades: " + Arrays.toString(exercise1.getRoundedGrades(grades)));
        System.out.println("Max rounded grade: " + exercise1.getMaxRoundedGrade(grades));
        System.out.println("====================================================================");

        int[] numbers = { 4, 8, 3, 10, 17 };
        Exercise2 exercise2 = new Exercise2();
        System.out.println("Max: " + Exercise2.getMax(numbers));
        System.out.println("Min: " + Exercise2.getMin(numbers));
        System.out.println("Max sum n-1: " + exercise2.getMaxSum(numbers));
        System.out.println("Min sum n-1: " + exercise2.getMinSum(numbers));
        System.out.println("====================================================================");

        int[] number1 = { 1, 3, 0, 0, 0, 0, 0, 0, 0 };
        int[] number2 = { 8, 7, 0, 0, 0, 0, 0, 0, 0 };
        Exercise3 exercise3 = new Exercise3();
        System.out.println("Sum: " + Arrays.toString(exercise3.getSum(number1, number2)));
    }
}