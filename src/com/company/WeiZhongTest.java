package com.company;

import java.util.Scanner;

public class WeiZhongTest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //n！中末尾的0全都由因子2和5相乘得出

        int x=0;
        int y=0;
        for(int i=5;i<=n;i++){
            int p=i;
            while(p%5==0){
                p/=5;
                y++;
            }
        }
        x=y;

        int ans=1;
        for(int i=1;i<=n;i++){
            int p=i;
            while(p%2==0&&x!=0){
                p/=2;
                x--;
            }
            while(p%5==0&&y!=0){
                p/=5;
                y--;
            }
            p%=10;
            ans=(ans*p)%10;
        }

        System.out.print(ans);
    }
}
