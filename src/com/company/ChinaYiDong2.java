package com.company;

import java.util.Scanner;

public class ChinaYiDong2 {
    public static int getPalindromeDP(String str){
        if(str==null||str.length()==0)
            return 0;
        int length=str.length();
        int dp[][]=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j)
                    dp[i][j]=1;
                else
                    dp[i][j]=0;
            }
        }

        //开始计算i，j的连续子字符串是否是回文字符串
        for(int i=0;i<length-1;i++) {
            //判断相邻元素是否相同
            if(str.charAt(i)==str.charAt(i+1)){
                dp[i][i+1]=1;
            }
        }

        for(int i=3; i<=length;i++){
            for(int j=0;j<length-i+1;j++){
                //判断当前i,j的回文串
                int curLast=j+i-1;
                if(str.charAt(j)==str.charAt(curLast)&&dp[j+1][curLast-1]==1){
                    dp[j][curLast]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(dp[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            System.out.println(getPalindromeDP(str));
        }
    }
}

