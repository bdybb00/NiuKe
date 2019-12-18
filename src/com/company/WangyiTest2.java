package com.company;

import java.util.Scanner;

public class WangyiTest2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            long A=sc.nextLong();
            long B=sc.nextLong();
            long p=sc.nextLong();
            int q=sc.nextInt();
            int result=0;
            while(A<B){
                if(A+p<B){
                    p=p*q;
                }
                else{
                    A=A+p;
                }
                result++;
            }
            System.out.println(result);
        }
    }
}
