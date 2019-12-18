package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test3602 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n位
        int m=sc.nextInt(); //m进制
        int array1[]=new int[n];
        int array2[]=new int[n];

        for (int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            array2[i]=sc.nextInt();
        }
        //进行排序
        Arrays.sort(array1);
        Arrays.sort(array2);
        int result[]=new int[n];
        int index=-1;
        for(int i=n-1;i>=0;i--){
            int temp=-1;
            for(int j=n-1;j>=0;j--){
                if(array2[j]!=-1){
                    if(array1[i]+array2[j]<m){
                        temp=array1[i]+array2[j];
                        index=j;
                        break;
                    }
                    else if (((array1[i]+array2[j])%m)>temp){
                        temp=(array1[i]+array2[j])%m;
                        index=j;
                    }
                }
                /*if(array2[j]!=-1&&((array1[i]+array2[j])%m>temp)){
                    temp=(array1[i]+array2[j])%m;
                    index=j;
                }*/
            }
            result[i]=temp;
            array2[index]=-1;
        }
        Arrays.sort(result);
        for(int i=n-1;i>=0;i--){
            System.out.print(result[i]);
        }
    }
}
