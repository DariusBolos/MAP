package org.example;
import java.util.Arrays;

public class Exercise1 {
    public static int[] getInsufficientGrades(int[] grades) {
        int[] newGrades = new int[grades.length];
        int newIndex = 0;

        for(int index = 0; index < grades.length; ++index) {
            if(grades[index] < 40) {
                newGrades[newIndex++] = grades[index];
            }
        }
        
        return Arrays.copyOfRange(newGrades, 0, newIndex);

        // return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }

    public static double getAverageGrade(int[] grades) {
//        int sum = Arrays.stream(grades).reduce(0, (a, b) -> a + b);

        int sum = 0;

        for (int index = 0; index < grades.length; ++index) {
            sum += grades[index];
        }

        return Math.round((double) sum / grades.length * 100) / 100.0;
    }

    public static int[] getRoundedGrades(int[] grades) {
//        return Arrays.stream(grades).map(grade -> {
//            if (grade % 5 >= 3 && grade >= 38) {
//                return grade + (5 - grade % 5);
//            }
//            return grade;
//        }).toArray();

        for (int index = 0; index < grades.length; ++index) {
            if (grades[index] % 5 >= 3 && grades[index] >= 38) {
                grades[index] += 5 - grades[index] % 5;
            }
        }

        return grades;
    }

    public static int getMaxRoundedGrade(int[] grades) {
//        return Arrays.stream(getRoundedGrades(grades)).max().getAsInt();

            int max = grades[0];

            for (int index = 1; index < grades.length; ++index) {
                if (grades[index] > max) {
                    max = grades[index];
                }
            }

            return max;
    }
}
