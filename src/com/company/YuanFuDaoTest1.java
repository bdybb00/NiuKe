package com.company;

import java.util.Scanner;

public class YuanFuDaoTest1 {
    public static void printArr(int arr[][],int startx,int starty,int n,int m){
        //输出左外环
        for(int i=starty;i<n-starty;i++){
            System.out.print(arr[i][startx]+" ");
        }

        //输出底座
        for(int i=startx+1;i<m-startx;i++){
            System.out.print(arr[n-starty-1][i]+" ");
        }
        //输出右边
        for(int i=n-starty-2;i>=starty;i--){
            System.out.print(arr[i][m-1-startx]+" ");
        }

        //输出最上方
        for(int i=m-startx-2;i>startx;i--){
            System.out.print(arr[starty][i]+" ");
        }
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }



        //开始旋转  左--下--右--上；
        int temp=Math.min(n,m);
        if(temp%2==0){
            temp=temp/2;
        }
        else
            temp=temp/2+1;
        for(int i=0;i<temp;i++){
            printArr(arr,i,i,n,m);
        }

    }



}
