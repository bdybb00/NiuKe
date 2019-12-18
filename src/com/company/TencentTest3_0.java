package com.company;


import java.util.Scanner;


public class TencentTest3_0 {

    public static void main(String[] args) {
        //计算两个数组中奇数和偶数组合的总数量
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();//表示办公室数
        int m= s.nextInt();//表示搬运工数
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int time=1;
        for(int i=0;i<n;i++){
            //while(true){
                if(m>arr[i]){//搬运工可以在此时间搬完，而剩余的工人已经走到下一节点
                    time++;
                    m-=arr[i];
                  //  break;
                }else{ //此节点不能搬完，，就让所有工人搬
                    int temp=arr[i]%m;
                    int t=arr[i]/m;
                    time+=(t+(temp==0?0:1));
                    //arr[i]-=m;
                    m-=temp;
                }
           // }
        }
        System.out.println(time);


    }

}
