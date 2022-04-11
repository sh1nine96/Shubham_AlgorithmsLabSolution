package com.gl.javafsd.traveller.currencyspending;

import java.util.Arrays;

public class BubbleSort {

    private int[] data;
    public BubbleSort(int[] data){
        this.data = data;
    }

    public void sort(){
        sortDescending();
    }
    public void sortDescending(){
        int len = data.length;
        for(int i = 0; i < (len -1); i++){
            for(int j = 0; j < (len - i -1); j++){
                if(data[j] < data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        testDescendingSort(new int[]{10, 20, 30, 25});
    }

    private static void testDescendingSort(int[] data){
        BubbleSort sort = new BubbleSort(data);
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(data));

        System.out.println("After Sorting");
        sort.sortDescending();
        System.out.println(Arrays.toString(data));
    }
}
