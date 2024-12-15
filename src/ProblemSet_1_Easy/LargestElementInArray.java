package ProblemSet_1_Easy;
/*
https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
 */
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(largest01(arr));
        System.out.println(largest02(arr));
    }
    //Approach 1
    public static int largest01(int[] arr) {
        // code here
        int max=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
             if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    //Approach 2
    public static int largest02(int[] arr) {
        // code here
        int max=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}


