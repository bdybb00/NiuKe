package com.company;

import java.util.Scanner;

public class YouZanTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int k=0;k<T;k++){
            long N=sc.nextLong();
            int count=0;
            //计算N=(j+1)(i+1)-1
            N=N+1;
            for(int i=1;i<Math.sqrt(N);i++){
                if(N%(i+1)==0&&N/(i+1)>=(i+1)){
                    count++;
                }
            }
            System.out.print(count);
        }

        

    }
}
