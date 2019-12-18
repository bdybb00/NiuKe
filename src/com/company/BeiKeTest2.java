package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BeiKeTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//参赛人数
        int  array[]=new int[n];
        int count=0;
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            int j=i+1;
            for(j=n-1;j>i;j--){
                if(array[i]>=array[j]*0.9){
                    break;
                }
            }
            count+=(j-i);
        }
       /* for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]<=array[j]&&array[i]>=array[j]*0.9){
                    count++;
                }
            }
        }*/
        System.out.print(count);

    }
}
