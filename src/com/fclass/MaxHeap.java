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
    public void add(int num){
        //don't wanna store anything on the 0th index, so that we can use it for other stuff
        currentSize++;
        if(currentSize >= heapSize){
            currentSize--;
            throw new ArrayIndexOutOfBoundsException("can't add anymore");
        }else{
            maxHeap[currentSize] = num;
        }


        //polling the heap
        siftup(currentSize);
//        int index = currentSize;
//        int parent = index/2; //so 2,3 are child of 1 -> 2/2= 1 and 3/2=1
//        //currentsize > 1 because if currentSize =1 then it means it's the first element and can't have parent
//        while (maxHeap[index] > maxHeap[parent] && index > 1){
//            //replace maxHeap[parent] with maxHeap[currentSize]
//            int temp = maxHeap[parent];
//            maxHeap[parent] = maxHeap[index];
//            maxHeap[index] = temp;
//            index = parent;
//            parent = parent/2;
//        }
    }
    private void siftup(int index){

        int parent = index/2; //so 2,3 are child of 1 -> 2/2= 1 and 3/2=1
        //currentsize > 1 because if currentSize =1 then it means it's the first element and can't have parent
        while (maxHeap[index] > maxHeap[parent] && index > 1){
            //replace maxHeap[parent] with maxHeap[currentSize]
            int temp = maxHeap[parent];
            maxHeap[parent] = maxHeap[index];
            maxHeap[index] = temp;
            index = parent;
            parent = parent/2;
        }
    }

    public int[] values(){
        return Arrays.stream(maxHeap).skip(1).toArray();//skip the first one from maxHeap
    }

}
