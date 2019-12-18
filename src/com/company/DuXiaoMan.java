package com.company;

import java.util.Scanner;

public class DuXiaoMan {
    public static String leftPad(String s,int length,String temp){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length-s.length();i++){
            sb.append(temp);
        }
        sb.append(s);
        return sb.toString();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String strs[] = str.split(" ");

            int lenA = strs[0].length();
            int lenB = strs[1].length();
            int length = lenA;
            if (lenA > lenB) {
                strs[1] = leftPad(strs[1], lenA, "0");

            } else {
                strs[0] = leftPad(strs[0], lenB, "0");

            }

            int[] arrC = new int[length + 1];
            for (int i = strs[0].length() - 1; i >= 0; i--) {
                int ai = Integer.parseInt(strs[0].charAt(i) + "");
                int bi = Integer.parseInt(strs[1].charAt(i) + "");
                int ci = arrC[i + 1];
                int t = ai + bi + ci;
                arrC[i + 1] = t % 10;
                arrC[i] = t / 10;
            }

            StringBuffer res = new StringBuffer();
            for (int i = 0; i < arrC.length; i++) {
                if (i == 0 && arrC[i] == 0) continue;
                res.append(arrC[i]);
            }
            if (res.length() > strs[2].length()) {
                System.out.println("true");
            } else {
                boolean is=true;
                for (int i = 0; i < res.length(); i++) {
                    if (res.charAt(i) <= strs[2].charAt(i)) {
                        is=false;
                        System.out.println("false");
                        break;
                    }
                }
                if(is){
                System.out.println("true");}
            }
        }
    }
}
