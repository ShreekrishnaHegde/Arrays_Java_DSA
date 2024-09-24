package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=6;
        System.out.println(binary(arr,target));
    }

    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            //middle element
            //int middle=(start+end)/2;start+end may be larger than the value that int can hold.
            int mid=start+ (end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            if(target>arr[mid])
                start=mid+1;
            else
                return mid;

        }
        return -1;
    }
}
/*
->Array must be sorted
->Initialize two pointers for the starting and ending of original array
->Find the middle element of the original array
->If target element is greater than middle element, shift the left pointer to element next to the middle.
->If target element is smaller than middle element, shift the right pointer to the element previous to the middle.
->Repeat this until right and left pointers cross each other.

->When the element to be searched is at the end, it is the worst case.
->Time Complexity O(logN)
->Space Complexity O(1)

 */
