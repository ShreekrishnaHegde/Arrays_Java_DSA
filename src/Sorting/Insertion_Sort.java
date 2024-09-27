package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3,0,-5};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                    break;
            }
        }
    }
}

/*
->Here, we divide the array into small parts and sort it then increase its size.
->Ex:
    Select first two indices then sort them, then select the 3rd index and sort.
->In essence, we have to insert the next element into the right part of the array ,then put it in the correct
    index of left side.
->After 1st pass , first two elements will be sorted, after 2nd pass, first 3 elements will be sorted.
->Hence it takes n-1 pass , where n is the length of the array.
->Time Complexity: Worst Case- O(n2) Best Case-Linear Complexity
->Steps get reduced when array is sorted and hence it is adaptive.
->It is stable sorting algorithm.
->It is used for smaller size arrays.
->Works good when array is partially sorted.
->It takes part in hybrid sorting algorithm.

 */
