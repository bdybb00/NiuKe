package com.company;

import java.util.Scanner;

public class PingAnTest2 {
    public static int tranS(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum=sum*10+(str.charAt(i)-'0');
        }
        return sum;
    }
    public static void isSubNet(String ip1,String ip2,int len ){
        String str1[]= ip1.split("\\.");
        String str2[]=ip2.split("\\.");
        int yuNum=len%8;
        int chNum=len/8;
       // System.out.println(chNum);
       // System.out.println(str1.length);
        boolean isSame=true;
        for(int i=0;i<chNum;i++){
            if(tranS(str1[i])!=tranS(str2[i])){
                isSame=false;
                System.out.println("false");
                return;
            }
        }
        int num1=tranS(str1[chNum]);
        int num2=tranS(str2[chNum]);
        for(int j=0;j<yuNum;j++){

            if((num1&(1<<(7-j)))!=(num2&(1<<(7-j)))){
                isSame=false;
                System.out.print("false");
                return ;
            }
            //进行位运
        }
        System.out.print("true");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ip1=sc.next();
        String ip2=sc.next();
        int len=sc.nextInt();
        isSubNet(ip1,ip2,len );
    }
}
