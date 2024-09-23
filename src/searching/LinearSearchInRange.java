package searching;

public class LinearSearchInRange {
    public static void main(String[] args) {

        int[] arr={123,234,56,7,8};
        int target=7;
        System.out.println(range(arr,target,0,2));
    }

    static int range(int[] arr,int target,int start, int end){
        if(arr.length==0)
            return -1;
        for (int i = start ; i <=end; i++) {
            if(target==arr[i])
                return i;
        }
        return -1;

    }
}
