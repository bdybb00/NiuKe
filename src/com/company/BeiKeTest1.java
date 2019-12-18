package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BeiKeTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[50000];//arr数组表示输入的序列
        int[] dp = new int[50000];//dp数组中存放上升序列的长度，dp[i]表示以arr[i]结尾的子序列的最大长度
        for(int i = 1;i <= n;i++) {
            arr[i] =  sc.nextBigInteger();
        }
        int result =-1;//记录dp中最大的值
        for(int i = 1;i <= n;i++) {//按顺序计算dp[i]的值
            dp[i] = 1;//假设该子序列中只有arr[i]，故长度为1，即其自身成为一个子序列
            for(int j = 1;j < i;j++) {
                if(arr[i].compareTo( arr[j])>0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}
