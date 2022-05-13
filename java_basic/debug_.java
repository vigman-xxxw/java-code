package com.edu.debug_;

import java.util.Arrays;

public class debug_ {
    public static void main(String[] args) {
        int sum =0;
        int[] arr = {1,2,4,22,-22};
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("end...");
    }
}
