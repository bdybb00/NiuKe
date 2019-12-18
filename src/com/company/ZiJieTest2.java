package com.company;

import java.util.Scanner;

public class ZiJieTest2 {
    public static int compute(int n){
        if(n==0)
            return 1;
        if(n==2){
            return 1;
        }else if(n==4){
            return 2;
        }else{
            int count =0;
            int i=1;
            for( i=1;i<n/2;i++){//选取除0的另外一个节点的下标
                if(i%2==1){
                    count+=(compute(i-1)*compute(n-i-1))%1000000007;
                }
            }
            count=(count*2)%1000000007;
            if(i==n/2){
                count+=(compute(i-1)*compute(n-i-1))%1000000007;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //表示节点的数据
        int result=compute(n);
        System.out.print(result);
    }
}
