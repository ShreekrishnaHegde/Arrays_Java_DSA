package searching;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=9;
        System.out.println(Arrays.toString(search2d(arr,target)));
        System.out.println(max(arr));
    }

    static int[] search2d(int[][] arr,int target){
        if(arr.length==0)
            return new int[]{-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        return max;

    }
}
