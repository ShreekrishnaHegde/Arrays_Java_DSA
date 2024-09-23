package problems;

public class NumberOfEvenDigitsNumber {
    public static void main(String[] args) {
        /*
        Here we have to find the number of digits having even number of digits.
          Leetcode-1592
         */
        int[] nums={12,13,14,15,16,17};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i]))
                count++;

        }
        System.out.println(count);
    }

    //function to return number of digits in each number
    static int digits(int n){
        return (int)(Math.log10(n)+1);
    }

    static boolean even(int n){
        int NumberOfDigits=digits(n);
            return NumberOfDigits%2==0;
    }
}
