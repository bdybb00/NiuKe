package com.company;

import java.util.Scanner;

public class WangYiTest3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            long arr[]=new long[n];
            for( int j=0;j<n;j++){
                arr[j]=sc.nextLong();
            }
            //利用前后指针进行计算
            long sum=arr[0]; //表示前j-1个和
            int dp[]=new int[n];
            dp[0]=1;
            for(int j=1;j<n;j++){
                if(sum<=arr[j]){
                    dp[j]=dp[j-1]+1;
                }else{
                    dp[j]=1;
                }
                sum+=arr[j];
            }
            int length=dp[0];
            for(int j=0;j<n;j++){
                if(dp[j]>length){
                    length=dp[j];
                }
            }
            System.out.println(length);
        }
    }
}
