package com.company;

import java.util.*;

public class Test2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<N;i++){
            int temp=sc.nextInt();
            list.add(temp);
        }

        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<M;i++){
            int temp=sc.nextInt();
            set.add(temp);
        }

        List<Integer> list2 = new ArrayList<Integer>(set); //
        int te=0;//记录每次开始比较的起始位置
        int i=0;//遍历集合
        while(i<set.size()&&te<list.size()){
            int temp=list.get(te);
            if(temp>=list2.get(i)){
                list.add(te,list2.get(i));
                i++;
            }
            te++;
        }
        while(i<set.size()){
            list.add(list2.get(i));
            i++;
        }

        for (Integer l:list) {
            System.out.print(l+" ");
        }
    }
}
