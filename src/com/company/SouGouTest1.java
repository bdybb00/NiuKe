package com.company;
import java.util.LinkedList;
import java.util.Scanner;
public class SouGouTest1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //过滤规则
        int M = sc.nextInt();   //IP条数
        String arrs[][]=new String[N][];
        for(int i=0;i<N;i++){
            String temp=sc.nextLine();
            arrs[i]=temp.split(".",4);
        }
        for(int x=0;x<M;x++){
            String temp[]=sc.nextLine().split(".",4);  //输入的数据
            int result=0; //表示是否匹配的结果  表示不会过滤
            for(int i=0;i<N;i++){ //和过滤规则依此判断
                if(arrs[i][0].equals("*")){
                    int p=1;
                    int j=0;
                    for(j=4-(arrs[i].length-1);j<temp.length;j++){
                        if(!temp[j].equals(arrs[i][p])){
                            break;
                        }
                        p++;
                    }
                    if(j==temp.length){
                        result=1;
                        break;
                    }
                }
                else if(arrs[i][arrs[i].length-1].equals("*")){ //最后一位为“*”
                    int j=0;
                    for(j=0;j<arrs[i].length-1;j++){
                        if(!temp[j].equals(arrs[i][j])){
                            break;
                        }
                    }
                    if(j==arrs[i].length-1){
                        result=1;
                        break;
                    }
                }
                else{ //表示没有*的情况
                    int j=0;
                    for(j=0;j<arrs[i].length;j++){
                        if(!arrs[i][j].equals(temp[j])) {
                            break;
                        }
                    }
                    if(j==arrs[i].length ){
                        result=1;
                        break;
                    }
                }
            }
            LinkedList<Integer> list=new LinkedList<>();
            list.add(1);
            list.pop();
            System.out.println(result+" ");
        }
    }
}
/*
* 5 3
222.205.58.16
*.58.16
222.205.58.*
*.16
224.*
222.205.58.17
222.205.59.19
223.205.59.16
* */