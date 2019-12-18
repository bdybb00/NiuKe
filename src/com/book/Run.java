package com.book;

public class Run {
    public static void main(String[] args){
        DBTools dbTools=new DBTools();
        for (int i=0;i<20;i++){
            BackupA input=new BackupA(dbTools);
            input.start();
            BackupB output=new BackupB(dbTools);
            output.start();
        }
    }
}
