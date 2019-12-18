package com.company;

import java.util.Scanner;

public class WuBATest1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        int t=0;
        while(n!=0){
            t=n%27;
            n=n/27;

            if(t>=0&&t<=9){
                sb.append(t);
            }else if(t==10){
                sb.append("`");
            }else if(t==11){
                sb.append("!");
            }else if(t==12){
                sb.append("@");
            }else if(t==13){
                sb.append("#");
            }else if(t==14){
                sb.append("$");
            }else if(t==15){
                sb.append("%");
            }else if(t==16){
                sb.append("^");
            }else if(t==17){
                sb.append("&");
            }else if(t==18){
                sb.append("*");
            }else if(t==19){
                sb.append("(");
            }else if(t==20){
                sb.append(")");
            }else if(t==21){
                sb.append("{");
            }else if(t==22){
                sb.append("}");
            }else if(t==23){
                sb.append("\\");
            }else if(t==24){
                sb.append("<");
            }else if(t==25){
                sb.append(">");
            }else if(t==26){
                sb.append("?");
            }
        }
        char temp[]=sb.toString().toCharArray();
        for(int i=temp.length-1;i>=0;i--){
            System.out.print(temp[i]);
        }

    }
}
