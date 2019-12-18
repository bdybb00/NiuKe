package com.company;

import java.util.Scanner;

public class BaiDuTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        //(n-a)(m-b)<=k 且 Min(a,b)
        int a=0;
        int b=0;
        if(n<=m){
            while((n-a)>1&&(n-a)*(m-b)>k){
                a++;
            }
            if((n-a)*(m-b)<=k){
                System.out.print(a+b);
                return;
            }else{
                while((m-b)>1&&(n-a)*(m-b)>k){
                    b++;
                }
                System.out.print(a+b);
                return ;
            }
        }else{
            while((m-b)>1&&(n-a)*(m-b)>k){
                b++;
            }
            if((n-a)*(m-b)<=k){
                System.out.print(a+b);
                return;
            }else{
                while((n-a)>1&&(n-a)*(m-b)>k){
                    a++;
                }
                System.out.print(a+b);
                return ;
            }
        }
    }
}
