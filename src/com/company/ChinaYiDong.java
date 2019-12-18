package com.company;

import java.util.Scanner;

public class ChinaYiDong {
    public static int getMethods(int N){
        if(N==1)return 1;
        if(N==2)return 2;
        return getMethods(N-1)+getMethods(N-2);
    }
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<11;i++) {
            System.out.println(getMethods(i));
        }

    }
}
