package com.company;

import java.util.Scanner;

public class XiaoHongshuTest2 {
    public  static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        int count=0;

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(arr[i]=='(')
                count++;
            else if(arr[i]==')')
                count--;
            else if(count!=0)
                continue;
            else if(arr[i]=='<'&&sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }else if(arr[i]!='<'){
                sb.append(arr[i]);
            }
        }
        System.out.print(sb.toString());
    }
}
