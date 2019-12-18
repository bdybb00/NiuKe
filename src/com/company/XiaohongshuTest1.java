package com.company;

import java.util.Scanner;

public class XiaohongshuTest1 {
    public static int shortPath(int arr[][],int n,int m){
        if (n == 0||m==0)
            return -1;
        // f[m][n] 表示从起始位置到当前位置的最短路径长度
        int[][] f = new int[n][m];
        // 先假设 f 中的每个点不可达，设为 Integer.MAX_VALUE
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                f[i][j] = Integer.MAX_VALUE;
               // b[i][j]=0;
            }
        }
        f[0][0]=0;
        for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]!=1){ //表示可以到达
                    if (i >= 1 &&f[i-1][j]!=Integer.MAX_VALUE) {
                        f[i][j] = Math.min(f[i][j], f[i - 1][j] + 1);
                    }
                    if (i + 1 < n &&f[i+1][j]!=Integer.MAX_VALUE ) {
                        f[i][j] = Math.min(f[i][j], f[i + 1][j] + 1);
                    }
                    if (j >= 1 &&f[i][j-1]!=Integer.MAX_VALUE  ) {
                        f[i][j] = Math.min(f[i][j], f[i][j - 1] + 1);
                    }
                    if (j+1<n &&f[i][j+1]!=Integer.MAX_VALUE ) {
                        f[i][j] = Math.min(f[i][j], f[i][j +1] + 1);
                    }
                }
            }
        }

        if (f[n - 1][m - 1] == Integer.MAX_VALUE) {
            return 0;
        }

        return f[n - 1][m - 1];
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<k;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            arr[x][y]=1;
        }
        System.out.print(shortPath(arr,n,m));

        //开始计算是否有路障
        //只能向下和向右行走
    }
}
