package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/*class PersonInfo implements Comparable{
    public int s;//表示分数
    public int index;//表示下标
    @Override
    public int compareTo(Object o) {
        return this.s-((PersonInfo)o).s;
    }
}*/

/*public class WangYiTest1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//班级总人数
       List<Integer> personInfos =new ArrayList<>();
       int scores[]=new int[n];
        for(int i=0;i<n;i++){
            int score=in.nextInt();
            personInfos.add(score);
            scores[i]=score;
        }
        //对数据进行排序
        Collections.sort(personInfos);
        //对分值进行计算
        int q=in.nextInt();//询问次数
        DecimalFormat df=new DecimalFormat("######0.000000");
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int index=in.nextInt(); //第几个
            int temp_score=scores[index-1];
           // System.out.println(temp_score);
            int nums=personInfos.indexOf(temp_score);//找到分数所对应的位置
           // System.out.println(nums);
            int i=nums+1;
            for(i=nums+1;i<n;i++){
                if(personInfos.get(i)==temp_score)
                    continue;
                else
                    break;
            }
            //System.out.println(i);
            double result=Double.valueOf(i-1)/Double.valueOf(n)*100;
            BigDecimal b=new BigDecimal(result);
            result=b.setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(df.format(result));
        }
    }
}*/

public class WangYiTest1 {
    public static boolean isCircle(int []array){
        int ismark[]=new int[array.length];//表示是否找过；
        ismark[0]=1;
        boolean isCircle=false;
        for(int i=0;i<array.length;i++){
            //
        }
        return isCircle;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();//n个整数
            //输入数组
            int []array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=in.nextInt();
            }
            //进行环判断
            System.out.println(isCircle(array));
            t--;
        }
    }
}