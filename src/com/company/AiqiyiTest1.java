package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AiqiyiTest1 {
    public static long comput(int n){
        long  result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return  result;
    }
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrA[]=new int[n-1];

        for(int i=0;i<n-1;i++){
            arrA[i]=sc.nextInt();
        }
        //遍历数组
        ArrayList<Integer> list=new ArrayList<>();
        int count=1;
        int unCount=0;
        for(int i=0;i<n-2;i++){
           if(arrA[i]==arrA[i+1]){
               count++;
           }
           else{
               list.add(count);
               unCount++;
               count=1;
           }
        }
        int result=0;
        result=(int)(comput(unCount));
        int tol=n-unCount;
        for(Integer i :list){
            result=(int)((comput(tol)/(comput(i)*comput(tol-i)))%((int)(Math.pow(10,9.))+7));
            tol=tol-i;
        }
        System.out.print(result);
        //

    }
}
