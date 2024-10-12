package org.example;

import java.util.Arrays;

public class Exercise1 {
    public static int[] getInsufficientGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }

    public static double getAverageGrade(int[] grades) {
        int sum = Arrays.stream(grades).reduce(0, (a, b) -> a + b);
        return Math.round((double) sum / grades.length * 100) / 100.0;
    }

    public static int[] getRoundedGrades(int[] grades) {
        return Arrays.stream(grades).map(grade -> {
            if (grade % 5 >= 3 && grade >= 38) {
                return grade + (5 - grade % 5);
            }
            return grade;
        }).toArray();
    }

    public static int getMaxRoundedGrade(int[] grades) {
        return Arrays.stream(getRoundedGrades(grades)).max().getAsInt();
    }
}
