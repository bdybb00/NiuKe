package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        long j=sc.nextLong();

        int count=0;
        while(k>0&&j>0&&k+j>=3){
            if(k>=j){
                k-=2;
                j--;
                count++;
            }else {
                k--;
                j-=2;
                count++;
            }
        }
        System.out.println(count);

    }
}
