package com.duleendra.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandyValue = findGreatestCandyValue(candies);
        List<Boolean> kidsWithGreatestCandies = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            kidsWithGreatestCandies.add(candies[i] + extraCandies >= greatestCandyValue);
        }
        return kidsWithGreatestCandies;
    }

    private static int findGreatestCandyValue(int[] candies) {
        int greatest = -1;
        for (int i = 0; i < candies.length; i++) {
            greatest = Math.max(candies[i], greatest);
        }
        return greatest;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}

