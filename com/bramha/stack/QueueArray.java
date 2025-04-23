package com.bramha.stack;

public class QueueArray {

    int[] arr;
    int start,end;
    int currSize,maxSize;

    public QueueArray(){

        arr = new int[5];
        start=-1;
        end=-1;
        currSize=0;
        maxSize=5;

    }

    public void push(int x){

        if (currSize==maxSize){
            System.out.println("QUEUE is FULL");
        }
        if(end==-1){
            start=0;
            end=0;
        }
        else{
            
        }

    }
}
