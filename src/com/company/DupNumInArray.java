package com.company;
import java.util.HashMap;

/*
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。


记录知识点：1.java的基本类型数组  默认初始化
            2.HashMap  放入元素 是put函数
* */
public class DupNumInArray {

        public static boolean duplicate(int[] numbers, int length, int [] duplication) {
            /*hash存储*/
            if(numbers==null||length==0||length==1){
                return false;
            }
            //方法一：利用hashMap进行判断   如果当前<Integer,Integer>中已经含有该key值则表示已经存在  已重复；
            //否则 直接存储
           /* HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<length;i++){
                if(map.containsKey(numbers[i])){
                    duplication[0]=numbers[i];
                    return true;
                }else{
                    map.put(numbers[i],numbers[i]);
                }
            }
            return false;*/

           //方法二：利用n个数都为0~n-1 的数组特性，，如果没有重复的数据，则该数组数据就是从0~n-1;
            //  所以对数组进行重新排序：
            //思路 就是依此遍历数组，将数组中的每一个数据num[i]和其所在下标 i比较 ，如果相等判断下一个；
            //         如果不相等，就比较这个数 num[i]和 它对应的数组的下标位置的数据作比较 num[num[i]]
            //                      如果相等，则表示有重复 返回
            //                      如果不相等，则将两个数替换 （目的是将数据放回到自己本来对应的下表位置）后继续比较num[i]和num[num[i]];
            //时间复杂度O(n) 空间复杂度O(1)
          /* int temp;
           for(int i=0;i<length;i++){
               //如果数和位置不相等
               while(numbers[i]!=i){
                   //先判断这个数和他应该在的位置的数据是否相等
                   if(numbers[i]==numbers[numbers[i]]){
                       duplication[0]=numbers[i];
                       return true;
                   }
                   temp=numbers[numbers[i]];
                   numbers[numbers[i]]=numbers[i];
                   numbers[i]=temp;
                   //就把numbers[i]放到下标是numbers[numbers[i]]中
               }
           }
           return false;*/
          //方法三：利用一个数组 代替HashMap,遍历数组时，将array[num[i]]++
            int[] array = new int[length];
            for(int i=0;i<length;i++){
                array[numbers[i]]++;
                if(array[numbers[i]]>1){
                    duplication[0]=numbers[i];
                    return true;
                }
            }
            return false;

    }
    public static void main(String[] args) {
	// write your code here
        int[] number = {2, 3, 1, 0, 2, 5, 3};
        int[] numbers = new int[1];
        duplicate(number,7,numbers);

        //Scanner s = new Scanner(System.in);
        // System.out.print("输入你的姓名：");
        // String name = s.nextLine();
        // System.out.print("输入你的年龄：");
        // int age = s.nextInt();
        // System.out.println("姓名：" + name + "  年龄：" + age );
        // s.close();
        // 若没有关闭Scanner对象将会出现警告

    }
}
