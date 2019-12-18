package com.company;
import java.util.Scanner;
public class BaiDuTest2 {
    public static boolean dfs(int arr[][],int visit[],int x,int sum,int n){
        if(x==n-1&&sum<=2){
            return true;
        }
        int i=0;
        for(i=0;i<n;i++){
            if(arr[x][i]==1&&visit[i]!=1){
                sum+=1;
                visit[i]=1;
               if(sum>2){
                    visit[i]=0;
                    sum-=1;
                    continue;
                }
                if(dfs(arr,visit,i,sum,n))
                {
                    return true;
                }else{
                    visit[i]=0;
                    sum-=1;
                }
            }
        }
        if(i!=n)
            return true;
        return false;
    }
    public static  void main(String args[]){
        //深度优先遍历
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println("到这里了"+n +" "+m);
            int arr[][]=new int[n][n];
            int x=0;
            int y=0;
            for(int j=0;j<m;j++){
                x=sc.nextInt();
                y=sc.nextInt();
                arr[x-1][y-1]=1;
                arr[y-1][x-1]=1;
            }
            System.out.println("到这里了");
            int visit[]=new int [n];
            visit[0]=1;
            for(int k=0;k<n;k++){
                visit[k]=0;
            }
            //进行深度优先遍历并回溯
            if(dfs(arr,visit,0,0,n)){
                System.out.println("POSSIBLE");
            }else{
                System.out.println("IMPOSSIBLE");
            }
        }

    }
}
