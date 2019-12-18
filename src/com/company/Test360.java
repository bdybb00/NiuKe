package com.company;

import java.util.Scanner;

public class Test360 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n行
        int m=sc.nextInt(); //m列
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        //开始计算面积
        int area=0;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp=array[i][j]*6-(array[i][j]-1)*2;
                area+=temp;
            }
        }
        //减去每行每列相邻两个重复的面积
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                temp=Math.min(array[i][j-1],array[i][j])*2;
                area-=temp;
            }
        }

        //相邻列
        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                temp=Math.min(array[i-1][j],array[i][j])*2;
                area-=temp;
            }
        }
        System.out.println(area);
    }
}
