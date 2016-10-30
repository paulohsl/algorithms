package br.com.paulo.firecode;


public class BubbleSort {

    public static void main(String[] args) {

        int[] value = {4,12,4,78,7,-1};

        bubbleSortArray(value);

    }

    public static int[] bubbleSortArray(int[] arr) {
        int temp;

        for(int i =0;i<arr.length;i++){

            for(int j = 1;j<arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }
}
