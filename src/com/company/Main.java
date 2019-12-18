package com.company;

import java.util.Scanner;

public class Main {
    public static boolean isCircle(String[] strings){
        if(strings==null||strings.length==0){
            return false;
        }
        int[] isremark = new int[strings.length];
        int i=1;
        isremark[0]=1;

            //表示遍历数组中所有数据
        char tempC=strings[0].charAt(strings[0].length()-1);
        while(i!=strings.length){
                //查找以tempC开始的字符串
              int j=0;
                for(j=0;j<strings.length;j++){
                    if (isremark[j]!=1&&tempC==strings[j].charAt(0)){
                        //表示找到一个下标
                        isremark[j]=1;
                        tempC=strings[j].charAt(strings[j].length()-1);
                        i++;
                        break;
                    }
                }
                if(j==strings.length){
                    return false;
                }
        }
        if(i==strings.length){
            return tempC == strings[0].charAt(0);
        }
        return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] strings=s.nextLine().split(" ");
        System.out.println(isCircle(strings));
    }
}
