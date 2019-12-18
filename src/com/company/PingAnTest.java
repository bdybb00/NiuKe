package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PingAnTest {

    public static void subStrings(String str1,String str2){
        int length=str2.length();
        boolean b=false;
        int j=length;
        Set<String> set=new TreeSet<String>();
        while(b!=true||j>0){
            //
            for(int i=0;i+j<=length;i++){
                if(str1.contains(str2.substring(i,i+j))){
                    b=true;
                    set.add(str2.substring(i,i+j));
                }
            }
            j--;
            if(b==true){
                break;
            }
        }
        for (String temp:set) {
            System.out.println(temp);
        }

    }
    public static void main(String args[]){

    }
}
