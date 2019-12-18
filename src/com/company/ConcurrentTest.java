package com.company;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

class SychronizedTest{
    //普通方法：加锁锁住的是类的对象实例

    private CountDownLatch cdt;
    SychronizedTest(CountDownLatch cdt){
        this.cdt=cdt;
    }
    public synchronized void method1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
        cdt.countDown();
    }

    public synchronized void method2(){
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
        cdt.countDown();
    }

    //静态方法：  加锁，锁住的是Class类
  public synchronized static void method3(){
        System.out.println("Method 3 start");
        try {
            System.out.println("Method 3 execute");
            Thread.sleep(3000); //sleep不释放锁 Sychronized是可重入锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 3 end");

    }

    public synchronized static void method4(){
        System.out.println("Method 4 start");
        try {
            System.out.println("Method 4 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 4 end");

    }
}
public class ConcurrentTest {

    public static void main(String args[]){
        CountDownLatch cdt=new CountDownLatch(2);
        SychronizedTest test=new SychronizedTest(cdt);
        CyclicBarrier cb=new CyclicBarrier(2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("数据库要进行更新了，先等待连接，解析等线程完毕***");
                try {
                    cdt.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("开始执行了");
            }

        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method2();
            }
        }).start();

      /* new Thread(new Runnable() {
            @Override
            public void run() {
                SychronizedTest.method4();
                try {
                    cb.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.print("Thread1等待结束****");

            }
        }).start();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                SychronizedTest.method3();
                try {
                    cb.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.print("Thread2等待结束****");
            }
        }).start();*/



    }
}
