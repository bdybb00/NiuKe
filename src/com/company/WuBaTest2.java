package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WuBaTest2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[200];
        for (int i = 0; i < 200; i++) {
            arr[i]=sc.nextInt();
        }
        int x=198;
        Arrays.sort(arr);
        System.out.print(arr[x-1]);
    }
}
