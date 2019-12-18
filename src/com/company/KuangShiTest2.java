package com.company;

import java.util.Scanner;

public class KuangShiTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        String str=null;
        str=sc.nextLine();
        char arr[]=str.toCharArray();


        int dp[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i][i]=1;
        }


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[j-1]){
                    dp[i][j]=dp[i][j-1];
                }else{
                    //最后一个和arr[j]不同
                    boolean isfind=false;
                    for(int m=i;m<j-1;m++){
                        if(arr[m]==arr[j]) {
                            dp[i][j] = dp[i][j - 1];
                            isfind=true;
                            break;
                        }
                    }
                    if(!isfind){
                        dp[i][j]=dp[i][j-1]+1;
                    }
                }
            }

        }

        //开始查找最长的
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr.length-1;j>=i;j--){
                System.out.println(dp[i][j]);
                if(dp[i][j]>result&&dp[i][j]<=n){
                    result=j-i+1;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}
