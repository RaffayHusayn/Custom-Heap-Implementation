package com.fclass;
import java.util.Arrays;

public class MaxHeap {
    int heapSize;//full size
    int currentSize;//currentSize
    int maxHeap[]; //this array powers the heap

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
        siftup(currentSize);
    }


    //removing elements
    public int pop(){
        if(currentSize < 1 ){
            throw new ArrayIndexOutOfBoundsException("there's no element in the heap to remove");
        }
        int temp = maxHeap[1];
        maxHeap[1] = maxHeap[currentSize]; //because the first element of array is always empty so currentSize-1 is not gonna work
        currentSize--;
        siftdown();
        return temp;
    }


    // getting elements without removing them
    public int peek(){
        return maxHeap[1];
    }


    //returns all the values in the heap
    public int[] values(){
        return Arrays.copyOfRange(maxHeap, 1, currentSize+1);//skip the first one from maxHeap
    }


    //helper methods to rearrange the heap after adding elements
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


    //helper method to rearrange elements of the heap after popping element from the top
    private void siftdown(){
        int replaceIndex;
        int parent = 1;
        while(parent <= currentSize / 2 ){
            int left = parent * 2;
            int right = parent * 2 + 1;
            if (maxHeap[left] > maxHeap[right]){
                replaceIndex = left;
            }else{
                replaceIndex = right;
            }

            if(maxHeap[parent] < maxHeap[replaceIndex]){
                int temp = maxHeap[parent];
                maxHeap[parent] = maxHeap[replaceIndex];
                maxHeap[replaceIndex] = temp;

                parent = replaceIndex;

                }
            }

    }

}