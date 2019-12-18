package com.company;

import java.util.Scanner;

public class BILiBiLiTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //开始查找个数
        int result=1;//表示只有自己的情况
        if(n==1){
            System.out.println( result);
            return;
        }
        int start=1;
        int end=2;
        int temp_sum=start+end;
        while(start<=n/2){
            if(temp_sum==n){
                result++;
            }
            while(temp_sum<n) { //加和小于的情况
                end++;
                temp_sum += end;
                if (temp_sum == n) {
                    result++;
                }
            }
            //加和大于n的情况；
            temp_sum-=start;
            start++;
        }
        System.out.print(result);
    }

}

