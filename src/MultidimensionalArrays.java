import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int[][] arr=new int[3][];
          int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(arr[0]));

        //Array input
        for (int i=0;i<arr.length;i++){//for number of rows
            for (int j=0;j<arr[i].length;j++)//for number of coloumns,
                arr[i][j]=in.nextInt();
        }
        //Output
        for (int i=0;i<arr.length;i++){//for number of rows
            for (int j=0;j<arr[i].length;j++)//for number of coloumns,
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }
        //Using toString method
        for (int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}

/*
->Number of rows is mandatory and number of coloumn is not.
->Array of arrays
->Memory allocation may not be continuous.
->arr[1] gives 4,5,6
->The size of coloumn is each row may not be same. It is not mandatory for it to be same.

 */