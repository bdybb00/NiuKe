package com.company;

import java.util.Scanner;

public class TestArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s=sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*//方法一：双指针算法
        int i=0;
        int j=0;
        int sum=0;
        int len=0;
        int temp_len=0;
        while(j<n){
            if(sum>s){
                sum-=arr[i];
                temp_len=j-i-1;
                if(temp_len>len)
                    len=temp_len;
                i++;
            }
            else{
                sum+=arr[j];
                j++;
            }
        }
        System.out.print(len);*/
        //方法二： 动态规划
        //dp[i]表示以arr[i-1]结尾的最长连续子序列的和
        //len[i]表示以arr[i-1]结尾的最长序列的长度

        int dp[]=new int[n+1];
        int len[]=new int[n+1];
        dp[0]=0;
        len[0]=0;
        for(int i=1;i<=n;i++){
            int sum=dp[i-1]+arr[i-1];
            if(sum<=s){
                dp[i]=sum;
                len[i]=len[i-1]+1;
            }else{
                //找到连续和的起始点
                int j=i-len[i-1];
                for( j=i-len[i-1];j<i;j++) {
                    sum -= arr[j-1];
                    if (sum <= s) {
                        dp[i] = sum;
                        len[i] = len[i - 1] -j+ 1;
                        break;
                    }
                }//
                if(j==i){
                    if(sum<=s){
                    dp[i] = sum;
                    len[i] = 1;
                    }else{
                        dp[i] = 0;
                        len[i] = 0;
                    }

                }
            }
        }
        //遍历len，查找最大值
        int max=len[0];
        for(int i=1;i<=n;i++){
            if(len[i]>max){
                max=len[i];
            }
        }
        System.out.print(max);

    }
}
