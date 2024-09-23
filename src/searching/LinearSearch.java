package searching;

import java.util.jar.JarOutputStream;

public class LinearSearch {
    public static void main(String[] args) {
    int[] nums={1,2,3,4,5,6,7,8,9};
    int target=5;
    int ans=linearsearch(nums,target);
    System.out.println(ans);
    }

    static int linearsearch(int[] arr,int target){
        if(arr.length==0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
}
/*
->We have to start searching from the first until we find the search element.
->Space Complexity
O(1)
->Time Complexity
best O(1)  & worst O(n)

 */