package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MaxHeap heap = new MaxHeap(4);
        heap.add(3);
        heap.add(0);
        heap.add(0);
        heap.add(4);
        int[] values = heap.values();
        for(int i = 0 ; i < values.length; i++){
            System.out.println(values[i]);
        }
//        heap.insert(2);
    }
}
