package com.company;

import java.util.Scanner;
import java.util.Stack;

public class QiAnxinTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_arr[]=sc.nextLine().split(" ");
        String str_arr2[]=sc.nextLine().split(" ");
        int arr1[]=new int[str_arr.length];
        int arr2[]=new int[str_arr2.length];
        int n=sc.nextInt();
        int result=0;
        for(int i=0;i<str_arr.length;i++){
            arr1[i]=Integer.valueOf(str_arr[i]);
            arr2[i]=Integer.valueOf(str_arr2[i]);
            if(arr1[i]==n){
                result=1;
            }
        }
        if(result==0) {
            System.out.print(result);
            return ;
        }

        Stack<Integer> stack=new Stack<>();
        stack.push(n);
        while(!stack.empty()){
            int temp=stack.pop(); //得到栈顶元素
            for(int i=0;i<str_arr.length;i++){
                if(arr2[i]==temp){
                    result++;
                    stack.push(arr1[i]);
                }
            }
        }
        System.out.print(result);

    }
}
