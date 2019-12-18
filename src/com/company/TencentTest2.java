package com.company;

import java.util.Arrays;
import java.util.Scanner;
class Person implements Comparable<Person>{
    long ai;
    long bi;
    public Person(){

    }
    public long getAi() {
        return ai;
    }
    public void setAi(long ai) {
        this.ai = ai;
    }
    public long getBi() {
        return bi;
    }
    public void setBi(long bi) {
        this.bi = bi;
    }

    @Override //实现降序
    public int compareTo(Person o) {
        if((this.ai-this.bi)>(o.ai-o.bi)){
            return -1;
        }else if ((this.ai-this.bi)<(o.ai-o.bi)){
            return 1;
        }else
        return 0;
    }
}

public class TencentTest2 {

    public static void main(String[] args) {
        //计算两个数组中奇数和偶数组合的总数量
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       //每个顾客有ai 和 bi两个属性
        //利用贪心算法 ai-bi越大的越排在前面；
        Person p[]=new Person[n];
        for(int i=0;i<n;i++){
            p[i]=new Person();
            p[i].setAi(s.nextLong());
            p[i].setBi(s.nextLong());
        }

        //按差值进行排序
        Arrays.sort(p);
        long  result=0;
        for(int i=0;i<n;i++){
            result+=(p[i].getBi()*n-p[i].getAi());
            result+=(i+1)*(p[i].getAi()-p[i].getBi());
        }
        System.out.println(result);
    }
}
