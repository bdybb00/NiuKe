package com.company;

/*
不允许修改数组的情况下 ，从n+1长度的数组中找到 任意一个重复的数字
此数组特点：每个数的范围是1~n,,因此数组中必有一个重复的数.
* */
public class DupNumInArray2 {

    //start 和 end 是要查找的范围  1~length-1
    public static void findDupNum(int[] array, int start, int end){
        //找到重复的数据
        if(array==null||array.length==0||array.length==1){
            return;
        }
        //if(start==end){
          //  System.out.println("重复数据："+start);
        //}
        while(start<=end) {
            //开始进行二分查找
            int mid =start+(end-start)/2;// (start + end) / 2;
            //计数  start~mid
            int num = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= mid &&array[i] >=start) {
                    num++;
                }
            }
            if(start==end){
                if(num>1){
                    System.out.println(start);
                    return;
                }else{
                    break;
                }
            }
            if (num > (mid - start + 1)) {
                //则表示重复数字在 start~mid中
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args){

        int[] array = {2, 3, 3, 4, 6, 2, 7, 1};
        findDupNum(array,1,7);

    }
}
