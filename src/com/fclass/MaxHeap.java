package com.fclass;

import java.util.Arrays;

public class MaxHeap {
    int heapSize;//full size
    int currentSize;//currentSize
    int maxHeap[];

    //constructor
    public MaxHeap(int size){
        this.heapSize = size+1;
        maxHeap = new int[heapSize];
    }

    //inserting elements
    public void insert(int num){
        //don't wanna store anything on the 0th index, so that we can use it for other stuff
        currentSize++;
        if(currentSize >= heapSize){
            currentSize--;
            throw new ArrayIndexOutOfBoundsException("can't add anymore");

        }else{
            maxHeap[currentSize] = num;
        }
    }

    public int[] values(){
        return Arrays.stream(maxHeap).skip(1).toArray();//skip the first one from maxHeap
    }

}
