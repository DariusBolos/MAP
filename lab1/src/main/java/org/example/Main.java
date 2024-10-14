package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================================");
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
        Exercise3 exercise3 = new Exercise3(number1, number2);
        System.out.println("Sum: " + Arrays.toString(exercise3.getSum()));
        System.out.println("Difference: " + Arrays.toString(exercise3.getDifference()));
        System.out.println("Multiplication: " + Arrays.toString(exercise3.getMultiplication(9)));
        System.out.println("Division: " + Arrays.toString(exercise3.getDivision(9)));
        System.out.println("====================================================================");

        int[] keyboards = { 15, 20, 10, 35 };
        int[] usbs = { 20, 15, 40, 15 };
        Exercise4 exercise4 = new Exercise4(keyboards, usbs);
        System.out.println("Min keyboard price: " + exercise4.getMinkeyboardPrice());
        System.out.println("Highest price: " + exercise4.getHighestPrice());
        System.out.println("Affordable usb: " + exercise4.getAffordableUsbs(30));
        System.out.println("Max spent: " + exercise4.getMaxSpent(70));
        System.out.println("====================================================================");
    }
}