package com.company;

import java.util.*;


    public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int casesCount = 0;

        Scanner s = new Scanner(System.in);

        if(s.hasNextInt()){
            casesCount = s.nextInt();
        }
        s.nextLine();
        int[] outputArrary = new int[casesCount];

        for(int i = 0; i < casesCount; i++){
            int count = 0;
            if(s.hasNextInt()){
                count = s.nextInt();
            }
            s.nextLine();

            int[] numbers = new int[count];
            sol.min = -1;
            for (int j = 0; j < count; j++){
                if (s.hasNextInt()) {
                    numbers[j] = s.nextInt();
                    if (numbers[j] < sol.min || sol.min < 0){
                        sol.min = numbers[j];
                    }
                } else {
                    System.out.println("You didn't provide enough numbers");
                    break;
                }
            }
            outputArrary[i] = sol.MinRound(numbers);

        }

        for(int i = 0; i < casesCount; i++){
            System.out.println(outputArrary[i]);
        }
    }
}


