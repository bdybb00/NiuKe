package com.company;

import java.util.Scanner;

public class WeiZhongTest2 {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long result=1;
        for(long i=1;i<=n;i++){
            result*=i;
        }
        result=result%((int)Math.pow(10,6)+3);
        System.out.print(result);
    }
}
