package com.company;

public class Solution {

    static boolean DBG = false;
    static int min;
    static int MinRound(int[] counts) {

        int[][] results = new int[counts.length][3];
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < 3; j++) {
                int delta = counts[i] - min + j;
                results[i][j] = 0;
                while (true) {
                    // Greedy approach
                    if (delta >= 5) {
                        delta -= 5;
                        results[i][j]++;
                    } else if (delta >= 2) {
                        delta -= 2;
                        results[i][j]++;
                    } else if (delta >= 1) {
                        delta -= 1;
                        results[i][j]++;
                    } else {
                        break;
                    }
                }
            }
        }
        int finalResult = -1;
        for (int i = 0; i < 3; i++) {
            int subFinal = 0;
            for (int j = 0; j < counts.length; j++) {
                subFinal += results[j][i];
                if (DBG) System.out.format("results[%d][%d] = %d \n", j, i, results[j][i]);
            }
            if (DBG) System.out.println(subFinal);
            if (finalResult < 0 || finalResult > subFinal) {
                finalResult = subFinal;
            }
        }

        return finalResult;
    }
}
