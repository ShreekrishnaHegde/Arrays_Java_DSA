package ProblemSet_1_Easy;
/*
https://www.geeksforgeeks.org/problems/second-largest3735/1
 */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(getSecondLargest01(arr));
        System.out.println(getSecondLargest02(arr));
    }

    //Approach 1:
    public static int getSecondLargest01(int[] arr) {
        // Code Here
        int n=arr.length;
        int max=arr[0];
        int sMax=-1;
        for(int i=0;i<n;i++)
            max=Math.max(arr[i],max);
        for(int i=0;i<n;i++){
            if(arr[i]==max)
                continue;
            sMax=Math.max(sMax,arr[i]);
        }
        return sMax;
    }

    //Approach 2:
    public static int getSecondLargest02(int[] arr) {
        // Code Here
        int largest=-1;
        int secondLargest=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }


}
