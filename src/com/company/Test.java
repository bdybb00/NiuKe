package com.company;

import java.util.*;

public class Test {

    public static void find(int []arrayA,int []arrayB){
        if(arrayB==null||arrayB.length<=0){
            System.out.print("NO");
        }
        int tempX=0; //记录下限
        int tempD=0; //记录上限
        int i=1;
        for(i=1;i<arrayA.length;i++){
            if(arrayA[i]<=arrayA[i-1]){
                //temp=arrayA[i];
                if(i<arrayA.length-1){
                    tempD=arrayA[i+1];
                }
                tempX=arrayA[i-1];
               // System.out.println(tempX);
                break;
            }
        }
        //从数组B中开始查找
        List<Integer> list=new ArrayList<>();
        for(Integer b:arrayB){
            list.add(b);
        }
        Collections.sort(list);

        //找到比temp大的数
        int j=0;
        for(j=arrayB.length-1;j>=0;j--){
            if(i<arrayA.length-1){
                if(list.get(j)<tempD&&list.get(j)>tempX){
                    arrayA[i]=list.get(j);
                    break;
                }
            }
            else if(i==arrayA.length-1){
                if(list.get(j)>tempX){
                    arrayA[i]=list.get(j);
                    break;
                }
            }
        }
        if(j==-1){
            System.out.println("NO");
        }else{
            for(int x=0;x<arrayA.length;x++){
                System.out.print(arrayA[x]+" ");
            }
        }
    }

    public static void main(String[] args) {
      /* Scanner s = new Scanner(System.in);
        String[] nums=s.nextLine().split(" ");
        int[] arrayA = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arrayA[i]=Integer.parseInt(nums[i]);
        }
       String[] num2=s.nextLine().split(" ");
        int[] arrayB = new int[num2.length];
        for(int i=0;i<nums.length;i++){
            arrayB[i]=Integer.parseInt(num2[i]);
        }
        find(arrayA,arrayB);*/

        // System.out.print("输入你的姓名：");
        // String name = s.nextLine();
        // System.out.print("输入你的年龄：");
        // int age = s.nextInt();
        // System.out.println("姓名：" + name + "  年龄：" + age );
        // s.close();
        // 若没有关闭Scanner对象将会出现警告

    }
}
