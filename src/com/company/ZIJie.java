package com.company;
import java.util.Scanner;
public class ZIJie {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long n = sc.nextLong();
            long count = 0;
            if (n <= 1) {
                count = 0;
            } else if (n == 2) {
                count = 1;
            } else if (n == 3) {
                count = 2;
            } else {
                for (long i = 2; i < n; i++) {
                    boolean flag = true;
                    for (long j = 2; j <=(long)(Math.sqrt(i)); j++) {
                        if (i % j == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
