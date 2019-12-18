package com.company;

import java.util.Scanner;

public class BILiBiLiTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String str1=sc.nextLine();
            String str2=sc.nextLine();

        if(str1.equals(str2)){
            System.out.println(0);
            return;
        }
        //表示从i到j编辑的距离
        int dp[][]=new int[str1.length()+1][str2.length()+1];

        for(int i=1;i<=str1.length();i++){
            dp[i][0]=i; //从i到0删除操作
        }
        for (int i=1;i<=str2.length();i++){
            dp[0][i]=i; //从0到添加操作
        }
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }
        System.out.print(dp[str1.length()][str2.length()]);
    }
}
