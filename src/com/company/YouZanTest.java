package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class YouZanTest {
    public static int smallestRange(int []A){
        Arrays.sort(A);
        int n=A.length;
        int res=A[n-1]-A[0];
        if(n==2){
            return res/2;
        }
        for(int i=0;i<n-1;i++){
            res=Math.min(A[i+1]-A[i],res);
        }
        return (res+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]=new int[m];
        int sum=0;
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
       // System.out.print(smallestRange(arr));
        int arg=sum/m; //商
        int f=sum%m;  //余数

        Arrays.sort(arr);
        if(f==0){
            System.out.print(Math.max(arg-arr[0],arr[m-1]-arg));
        }else{
            int arr2[]=new int[m];
            int i=0;
            for(i=0;i<m-f;i++){
                arr2[i]=arg;
            }
            for(i=m-f;i<m;i++){
                arr2[i]=arg+1;
            }
            int max=0;
            for(int j=0;j<m;j++){
                max=Math.max(max,Math.abs(arr[j]-arr2[j]));
            }

            System.out.print(max);
            //System.out.print(smallestRange(arr));

        }


    }
}
