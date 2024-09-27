package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int flag=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
                if (flag==0)
                    return;
            }
        }
    }
}


/*
->Sinking sort and Exchange sort are the other names for bubble sort.
->In every pass , we have to compare adjacent elements
->Ex: if i th element is greater than i+1 th element , then swap them,else move to next comparison. by comparing
    i+1 th and i+2 th element in the similar way. Continue this until you reach end of the array.
->For ascending order sorting, after the end of first pass, the largest element of the array
    will be at the last index of the array.
->Hence in each pass, the largest element will be placed at th end.
->In 1st pass n-1 comparisons will be made.
    Similarly total number of comparison= n-1 + n-2 + n-3 + ...+3+2+1.
    This can be expressed as (n-1)*(n-1+1)/2
    hence the time complexity in worst case is O(n2).
->Time Complexity in worst case is O(N2) and in best case it its O(N).
->We are not creating any new array ,hence space complexity is constant.
->Bubble Sort is "Stable Sorting Algorithm"
->It is "In-place Sorting Algorithm".

 */