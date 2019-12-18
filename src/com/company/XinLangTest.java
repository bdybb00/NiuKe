package com.company;



import java.util.Scanner;

public class XinLangTest {
    public static int value(String str){
        int value=0;
        for(int i=0;i<str.length();i++){
            value=value*10+str.charAt(i)-'0';
        }
        return value;
    }
    public static  int compareString(String arr0,String arr1){
        String temp1=arr0.replace(".",",");
        String temp2=arr1.replace(".",",");
        String arr_1[]=temp1.split(",");
        String arr_2[]=temp2.split(",");
        //将每一个字符串转为数值

        int length=arr_1.length<arr_2.length?arr_1.length:arr_2.length;
        for(int i=0;i<length;i++){
           int value= Integer.parseInt(arr_1[i]);
           int value2=Integer.parseInt(arr_2[i]);
           if (value==value2)
               continue;
           else if(value<value2){
               return 1;
           }else
               return 2;
        }
        if(length!=arr_1.length)
            return 2;
        else return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();//输入一样数据
        //去除空格
        str.replace(" ", "");
      String  strArr[]=str.split("，");

        //开始进行比较
        int result=0;//第一个最小的
        for(int i=0;i<strArr.length-1;i++){
            int temp=compareString(strArr[result],strArr[i+1]);
            if(temp==2)
                result=i+1;
        }
        System.out.print(strArr[result]);
    }
}
