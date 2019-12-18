package com.company;

import java.util.Scanner;

public class ZhaoShang {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        long mn=s.nextLong();
        int  arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.MIN_VALUE;
                if(i==j)
                    arr[i][j]=0;
            }
        }

        //
        for(int i=0;i<n-1;i++){
            int temp1=s.nextInt();
            int temp2=s.nextInt();
            int weight=s.nextInt();
            arr[temp1-1][temp2-1]=weight;
        }

        //开始找到最大值
        //利用佛洛依得
        int pathMath[][]=new int [n][n]; //记录最长路径

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                pathMath[i][j] = arr[i][j];
            }
        }
        //循环
        for(int k=0;k<n;k++){
            for(int M=0;M<n;M++){
                for(int N=0;N<n;N++){
                    int MN=pathMath[M][N];
                    int Mk=pathMath[M][k];
                    int kN=pathMath[k][N];
                    int addPath=(Mk==Integer.MIN_VALUE||kN==Integer.MIN_VALUE)?Integer.MIN_VALUE:Mk+kN;
                    if(MN<addPath){
                        pathMath[M][N]=addPath;
                    }
                }
            }
        }
        //输出

        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i;j<n;j++){
                if(max<pathMath[i][j])
                    max=pathMath[i][j];
            }
            System.out.print(max+" ");
        }
    }
}
