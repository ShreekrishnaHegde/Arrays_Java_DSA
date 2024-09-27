package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={1,2,0,56,-6};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //find the max. element in the remaining array and swap them.
            //finding last index in each iteration
            int last= arr.length-i-1;
            int max=0;
            //Finding the max in the current array.
            for (int j = 0; j <= last; j++) {
                if(arr[j]>arr[max])
                    max=j;
            }
            //swapping
            int temp=arr[last];
            arr[last]=arr[max];
            arr[max]=temp;
        }
    }
}
/*
->We are going to select an element and place it in the right place , hence the name selection sort.
->Ex for sorting in ascending order.
->Select the largest element and place it in the last position by swapping.
->Then select 2nd largest element place it in the last-1 position by swapping.
->Repeat this process
->To find the max. element n-1 comparisons are made in first iteration.
    similarly total number of comparison= 1+3+4+... n-1.
    Hence,
->Time Complexity: Worst Case-O(n2), Worst Case-O(n2).
->Space Complexity: O(1).
-<Not stable sorting algorithm
-performs well on small data.
 */