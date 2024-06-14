package org.example.Arrays;

public class Arrays {

    public int findMinimum(int[] arr){
        int minimum = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public int findMaximum(int[] arr){
        int maximum = 0;
        int secondMax = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum){
                secondMax = maximum;
                maximum = arr[i];
            }else if(arr[i] > secondMax && arr[i] != maximum){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }




}
