package com.company;

import javafx.util.Builder;

import java.math.BigDecimal;
import java.util.Scanner;

public class WangYITest {
    public static void main(String argvs[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long arr[]=new long[T];
        for(int i=0;i<T;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<T;i++){
            //每一位尽可能只能是0~9
            long j=arr[i]/9;

            long result=arr[i]%9;
            StringBuilder bb=new StringBuilder();
            if(result!=0){
                bb.append(result);
            }
            for(int m=0;m<j;m++){
                bb.append(9);
            }
            System.out.println(bb.toString());
        }
    }
}
