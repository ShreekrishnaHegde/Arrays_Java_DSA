package problems;
/*
->This question was asked in AMAZON Interview.
->This is "Simple" binary search question , but the question is asked in the different way.
->We have to find the target element in an infinte array.
->Infinite array simply means we cant use array length in our code.
->So this question simplifies to applying binary search to given array without using length of
    the array.

NoTE: this code will not work in all the cases.(out of bound exception)

 */
public class InfiniteArray_Searching {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;
            //double the size of the box
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binary(arr,target,start,end);
    }
    static int binary(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
