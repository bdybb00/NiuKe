package com.company;

import java.util.Scanner;

public class KuangShiTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= n==0 ? 0:1;
        int count=0;
        while(n!=0)
        {
            count ++;

            n= n&(n-1);
        }

        System.out.println(count);
    }
}
