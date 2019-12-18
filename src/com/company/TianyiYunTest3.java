package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class TianyiYunTest3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strs[]=str.split(";");


        //开始进行转换
        if(strs[0]==null||strs[1]==null||strs[0].length()!=strs[1].length()) {
            System.out.print("False");
            return ;
        }
        //开始进行遍历
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<Character,String> map2=new HashMap<>();
        char temp1='A';
        char temp2='A';
        for(int i=0;i<strs[0].length();i++){
            if (map1.containsKey(strs[0].charAt(i))) {
                sb1.append(map1.get(strs[0].charAt(i)));
            }else{
                map1.put(strs[0].charAt(i),String.valueOf(temp1));
                sb1.append(map1.get(strs[0].charAt(i)));
                temp1++;
            }

            if (map2.containsKey(strs[1].charAt(i))) {
                sb2.append(map2.get(strs[1].charAt(i)));
            }else{
                map2.put(strs[1].charAt(i),String.valueOf(temp2));
                sb2.append(map2.get(strs[1].charAt(i)));
                temp2++;
            }

        }

        String result1= sb1.toString();
        String result2= sb2.toString();
        if(result1.equals(result2)){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}
