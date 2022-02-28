package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MaxHeap heap = new MaxHeap(10);
        heap.add(3);
//        heap.add(10);
//        heap.add(11);
//        heap.add(12);
//        heap.add(39);
//        heap.add(67);
//        heap.add(0);
//        heap.add(4);
        int[] values = heap.values();
        for(int i = 0 ; i < values.length; i++){
            System.out.println(values[i]);
        }
        System.out.println("poping this out");
        System.out.println(heap.pop());
        System.out.println("remianing tree");
        values = heap.values();
        for(int i = 0 ; i < values.length; i++){
            System.out.println(values[i]);
        }
        heap.add(2);
        System.out.println(heap.pop());
    }
}
