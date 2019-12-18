package com.company;
import java.util.*;

public class Guazi {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str=s.next();
        int k=s.nextInt();
        if(str.length()==0||k<=0){
            System.out.print(str);
        }
        char[] arr=str.toCharArray();
        Set<String> set=new TreeSet<>();
        while(true) {
            int index = 0;
            char temp = arr[0];
            for (int i = 0; i < k; i++) {
                if (temp < arr[i]) {
                    temp = arr[i]; //记录当前最大值
                    index = i;
                }
            }
            for(int i=index;i<str.length()-1;i++){
                arr[i]=arr[i+1];
            }
            arr[str.length()-1]=temp;
            if(set.contains(String.valueOf(arr))){
                break;
            }
            set.add(String.valueOf(arr));
        }
        System.out.print(set.iterator().next());
    }
}
