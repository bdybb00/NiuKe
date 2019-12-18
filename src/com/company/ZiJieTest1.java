package com.company;

import java.util.*;

public class ZiJieTest1 {
    public static int compute(int [][]arr,int n){
        int count=1;
        List<Set<Integer>> list=new ArrayList<>();
        Set<Integer> mySet=new HashSet<>();
        mySet.add(0);
        list.add(mySet);
        for(int i=0;i<n;i++){
            boolean isDouPing=true;
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i][j]!=0){
                    isDouPing=false;
                }
                if(arr[i][j]>=3){
                    //表示为一个豆油
                    boolean iscontains=false;
                    for (Set temp:list) {
                        if(temp.contains(i)||temp.contains(j)){
                            temp.add(i);
                            temp.add(j);
                            iscontains=true;
                            break;
                        }
                    }
                    if(!iscontains){
                        mySet=new HashSet<>();
                        mySet.add(i);
                        mySet.add(j);
                        list.add(mySet);
                        count++;
                    }
                }
            }
            if(isDouPing){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n矩阵
        int M[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                M[i][j]=sc.nextInt();
            }
        }
       int count=compute(M,n);
        System.out.println(count);

    }
}
