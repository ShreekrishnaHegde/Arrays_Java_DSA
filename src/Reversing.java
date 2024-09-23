import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] arr={1,2,3,10,12,45,6,9};
        System.out.println("Array before reversing: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Array after reversing: ");
        System.out.println(Arrays.toString(arr));
    }
}
