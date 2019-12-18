package com.company;

import java.util.Scanner;

public class TencentTest1 {
    public static void main(String[] args) {
        //计算两个数组中奇数和偶数组合的总数量
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[m];

        int jicount1=0;
        int oucount1=0;
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
            if(arr1[i]%2==0)
                oucount1++;
            else
                jicount1++;
        }
        int jicount2=0;
        int oucount2=0;
        for (int j=0;j<m;j++){
            arr2[j]=s.nextInt();
            if(arr2[j]%2==0)
                oucount2++;
            else
                jicount2++;
        }

        int count=0;
        count=Math.min(jicount1,oucount2);
        count+=Math.min(jicount2,oucount1);
        System.out.print(count);

        //
    }
}
