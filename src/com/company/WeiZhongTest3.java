package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeiZhongTest3 {
    static Set<Integer> set=new HashSet<>();
    public static void dsf(int arr[][],int visit[],int start,int end,int n ){
        if(start==end){
            for(int i=0;i<visit.length;i++){
                if(visit[i]==1)
                set.add(i);
            }
            return;
        }


        for(int i=0;i<n;i++){
            if(visit[i]!=1&&arr[start][i]==1){
                visit[i]=1;
                dsf(arr,visit,i,end,n);
                visit[i]=0;
            }
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }

        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arr[x-1][y-1]=1;
            arr[y-1][x-1]=1;
        }

        int start=sc.nextInt();
        int end=sc.nextInt();
        //开始查找所有路径
        int visit[]=new int[n];
        visit[start-1]=1;
        dsf(arr,visit,start-1,end-1,n);

        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                System.out.print(i+1);
                System.out.print(" ");
            }
        }

    }
}

