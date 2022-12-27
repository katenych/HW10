package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};

        Random random = new Random();
        String stringArr1 = " ";
        String stringArr2 = " ";

        for (int i = 0; i < 7; i++) {
            stringArr1 += " " + (arr1[i] = random.nextInt(10));
            stringArr2 += " " + (arr2[i] = random.nextInt(10));

        }

        System.out.println(stringArr1);
        System.out.println(stringArr2);

        int count = 0;
        for(int i=0; i<arr1.length -1; i++){
            if(arr1[i] == arr2[i]) count++; {

            }

        }
        System.out.print("Кількість збігів: " + count);
    }
}
