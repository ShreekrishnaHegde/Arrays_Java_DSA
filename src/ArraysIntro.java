import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        //Syntax
        //datatype[] var_name=new datatype[size];
        Scanner in=new Scanner(System.in);
        int[] roll_no=new int[5];
        int[] arr={23,14,124};

        //Array input
        for(int i=0;i<roll_no.length;i++){
            roll_no[i]=in.nextInt();
        }
        //Array output
        for (int i=0;i<roll_no.length;i++){
            System.out.print(roll_no[i]+ " ");
        }
        //using toString method
        System.out.println(" ");
        System.out.println(Arrays.toString(roll_no));


        //Array of object

    }
}
/*
->Primitives are always stores in stack memory.
->Objects are stored in heap memory.
->All the type of the data in the array should be same
->roll_no is reference variables that points to array object which contains integers.
->Array declaration
 int[] ros;
 ros is getting defined in stack , memory is not created here.
->Array initialization.
  Memory creation happens here.object is being created in the heap memory.
  so memory allocation happens at run time. This is called dynamic memory allocation.
->Memory allocation may not be continuous, it depends on JVM.
-> Array index always starts at index 0.
-> new keyword is used to create an object.

--------null in Java-------
null is the by default value of the reference variables.


 */