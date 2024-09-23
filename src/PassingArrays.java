import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingArrays {
    public static void main(String[] args) {
        int[] arr={3,4,5,13};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0]=100;
    }

    /*
    ->Arrays are mutable in java and strings are immutable.
     */
}
