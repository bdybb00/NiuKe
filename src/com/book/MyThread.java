package com.book;

public class MyThread extends Thread {
    public MyThread(){
        System.out.println("---MyThread begin---");
        System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName()); //实体名称
        System.out.println("this.getName()="+this.getName()); //实例名称
        System.out.println(Thread.currentThread()==this);
        System.out.println("---MyThread begin---");
    }
    @Override
    public void run(){
        System.out.println("---run begin---");
        System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());//实体名
        System.out.println("this.getName()="+this.getName()); //实例名称
        System.out.println(Thread.currentThread()==this);  //结果是false
        System.out.println("---run end ---");
    }
    public static void main(String args[]){
        MyThread myThread=new MyThread();
        Thread t=new Thread(myThread);
        t.setName("test");
        t.start();

    }
}
