package com.company;


import java.util.Scanner;


public class TencentTest3{

    public static void main(String[] args) {
        //计算两个数组中奇数和偶数组合的总数量
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        long result=0;
        for(int i=0;i<n;i++){
            //表示开始时间
            long temp_result=0;
            long sum=0;
            long min=arr[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,arr[j]);
                sum+=arr[j];
                temp_result=Math.max(temp_result,sum*min);
            }
            result=Math.max(result,temp_result);
        }
        System.out.println(result);

    }

}
