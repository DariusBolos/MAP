package org.example;

import java.util.Arrays;

public class Exercise4 {
    private final int[] usbs;
    private final int[] keyboards;

    public Exercise4(int[] usbs, int[] keyboards) {
        this.usbs = usbs;
        this.keyboards = keyboards;
    }

    public int getMinkeyboardPrice(){
        return Arrays.stream(keyboards)
                .min()
                .orElse(0);
    }

    public int getHighestPrice(){
        int mostExpensivekeyboard = Arrays.stream(keyboards)
                .max()
                .orElse(0);

        int mostExpensiveusbs = Arrays.stream(usbs)
                .max()
                .orElse(0);

        return Math.max(mostExpensivekeyboard, mostExpensiveusbs);
    }

    public int getAffordableUsbs(int budget){
        int[] sorted = Arrays.stream(usbs).sorted().toArray();
        int index = binarySearch(sorted, 0, sorted.length - 1, budget);

        if(index != -1){
            return sorted[index];
        }

        return -1;
    }

    private int binarySearch(int[] values, int left, int right, int searchedValue) {
        int mid = (left + right) / 2;

        if(left > right) {
            return left - 1;
        }

        if(values[mid] == searchedValue) {
            return mid;
        }

        if(values[mid] < searchedValue) {
            return binarySearch(values, mid + 1, right, searchedValue);
        }

        if(values[mid] > searchedValue) {
            return binarySearch(values, left, mid - 1, searchedValue);
        }

        return -1;
    }

    public int getMaxSpent(int budget) {
        int maxSpent = -1;

        for (int keyboardsPrice : keyboards) {
            for (int usbsPrice : usbs) {
                int totalSpent = keyboardsPrice + usbsPrice;

                if (totalSpent <= budget) {
                    maxSpent = Math.max(maxSpent, totalSpent);
                }
            }
        }

        return maxSpent;
    }
}