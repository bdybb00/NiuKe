package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DiDiTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[]=new int[n];
        int i=0;
        char arr2[]=new char[n-1];
        char temp='0';
        int j=0;

        arr1[i] =sc.nextInt();
        arr2[i]=sc.next().charAt(0);
        temp=arr2[i];
        i++;
        while(sc.hasNext()){
            arr1[i] =sc.nextInt();//获取第二个数据
            if(sc.hasNext()) {
                arr2[i] = sc.next().charAt(0);
                if(temp=='/'||temp=='-'){
                    temp=arr2[i]; //两个相邻数据不排序
                    j=i+1;
                }else{
                    if(arr2[i]!=temp){ //与前面的数据不等且前面的字符不为‘/’，则将数据进行排序
                        temp=arr2[i];
                        Arrays.sort(arr1,j,i); //将从j到i进行排序
                        j=i+1;
                        continue;
                    }
                }
                i++;
            }

        }

        for(int x=0;x<n-1;x++){
            System.out.print(arr1[x]);
            System.out.print(" "+arr2[x]+" ");
        }
        System.out.print(arr1[n-1]);

    }
}
