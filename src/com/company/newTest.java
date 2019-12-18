package com.company;
interface  A{
    public static int i=2;
}
class B{
   int i=3;
}

public class newTest extends B implements A{
    public static void printI(){
        System.out.print(A.i);
    }

    public  static void main(String args[]){
        printI();
    }
}
