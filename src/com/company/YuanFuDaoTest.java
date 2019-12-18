package com.company;

import java.util.Scanner;

public class YuanFuDaoTest {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //进行查找
        int dp[]=new int [n+1] ;//用来记录前i-1个中最长连续数量
        dp[0]=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=s){
                dp[i+1]=dp[i]+1;
                sum+=arr[i];
            }
            else{
                int flag=0;
                for(int j=i-dp[i]+1;j<i;j++){
                    sum-=arr[j];
                    if(sum<=s){
                        dp[i+1]=i-j;
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    sum=arr[i];
                    if(sum>s){
                        dp[i+1]=0;
                    }else{
                        dp[i+1]=1;
                    }
                }
            }

        }
        int max=dp[0];

        for(int i=0;i<n+1;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        System.out.print(max);

    }
}
