package com.company;

import java.util.Scanner;

public class TianYiTunTest2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strs[]=str.split(", ");
        char temp[]=strs[0].toCharArray();
        strs[0]=String.valueOf(temp,1,temp.length-1);
        char temp2[]=strs[strs.length-1].toCharArray();
        strs[strs.length-1]=String.valueOf(temp2,0,temp2.length-1);


        int arr[]=new int [strs.length];
        for(int i=0;i<strs.length;i++){
            arr[i]=Integer.valueOf(strs[i]);
        }

        //开始动态规划
        int dp[]=new int[strs.length];
        dp[0]=arr[0];

        for(int i=1;i<strs.length;i++){
            dp[i]=Math.max(dp[i-1]+arr[i],arr[i]);
        }
        int result=dp[0];
        for(int i=0;i<strs.length;i++){
            if(dp[i]>result)
                result=dp[i];
        }
        System.out.println(result);
    }
}
