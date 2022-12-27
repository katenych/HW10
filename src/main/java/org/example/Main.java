package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] arr1 = new int[7];
        int [] arr2 = new int[7];



        Random random = new Random();
        String stringArr1 = " ";
        String stringArr2 = " ";

        for (int i = 0; i < 7; i++) {
            stringArr1 += " " + (arr1[i] = random.nextInt(10));
            stringArr2 += " " + (arr2[i] = random.nextInt(10));

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int count = 0;
        for(int i=0; i<arr1.length; i++){
            if (arr1[i] == arr2[i]) count++;
        }

        System.out.print("Кількість збігів: " + count);
    }
}
