package com.aniketh;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        // Strings are immutable in java and arrays are mutable in java.

    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
